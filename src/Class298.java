/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298 implements Interface41 {
	Index index;

	public Class445 method232(byte i) {
		return Class445.aClass445_5381;
	}

	public int getCompletion(int i) {
		if (((Class298) this).index.isValid())
			return 100;
		return ((Class298) this).index.getCompletion();
	}

	public Class445 method234() {
		return Class445.aClass445_5381;
	}

	public int method231() {
		if (((Class298) this).index.isValid())
			return 100;
		return ((Class298) this).index.getCompletion();
	}

	public Class445 method230() {
		return Class445.aClass445_5381;
	}

	public Class445 method233() {
		return Class445.aClass445_5381;
	}

	public Class445 method235() {
		return Class445.aClass445_5381;
	}

	Class298(Index class317) {
		((Class298) this).index = class317;
	}

	static final void method5300(CS2Executor class527, int i) {
		int i_0_ = (class527.intOpValues[class527.instrPtr * 301123709]);
		Class462.aStringArray5548[i_0_] = (String) (class527.objectStack[((class527.anInt7000 -= 1476624725) * 1806726141)]);
		Class282_Sub20_Sub10.method15263(i_0_, (byte) 42);
	}

	static final void method5301(CS2Executor class527, int i) {
		int widgetHash = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(widgetHash, (byte) 84);
		Interface class98 = Class468_Sub8.aClass98Array7889[widgetHash >> 16];
		Class29.method786(class118, class98, class527, -1279446637);
	}

	static final void method5302(CS2Executor class527, byte i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_2_, (byte) 23);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_2_ >> 16];
		Class109.method1852(class118, class98, class527, 1050548242);
	}

	static boolean method5303(byte i) {
		if (Class504.method8388(client.anInt7166 * -1741204137, (byte) 22))
			return false;
		return true;
	}

	public static boolean method5304(int i, int i_3_) {
		return i == 0 || i == 1 || i == 2;
	}
}
