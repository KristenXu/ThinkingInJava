package Chapter11;
import java.util.*;

import javax.swing.plaf.SliderUI;
class Snow{};
class Crusty extends Snow{};
class Slush extends Snow{};
class Powder extends Snow{};
class Light extends Powder{};
class Heavy extends Powder{};

public class AsListInterface
{
	public static void main(String []arg)
	{
		List<Snow>snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());
		//这样不行的，只有Powder类型
		//List<Snow>snow2=Arrays.asList(new Light(),new Heavy(),new Powder());
		List<Snow>snow2=Arrays.asList(new Light(),new Heavy(),new Slush(),new Powder());
		List<Snow>snow3=new ArrayList<Snow>();
		Collections.addAll(snow3,new Light(),new Heavy());
		//强制转换
		List<Snow>snow4=Arrays.<Snow>asList(new Light(),new Heavy(),new Powder());
		
	}
}