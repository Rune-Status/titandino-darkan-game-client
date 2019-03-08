import java.util.Queue;

public class RenderAnimIndexLoader {

	public static RenderAnimDefs aClass227_2669 = new RenderAnimDefs();
	SoftCache renderAnimCache = new SoftCache(64);
	Index aClass317_2671;
	Defaults6Loader aClass526_2672;

	public void method3615(int i_1, int i_2) {
		SoftCache softcache_3 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3858(i_1, (byte) 19);
		}
	}

	public RenderAnimDefs getRenderAnimDefs(int i_1, byte b_2) {
		SoftCache softcache_4 = this.renderAnimCache;
		RenderAnimDefs renderanimdefs_3;
		synchronized (this.renderAnimCache) {
			renderanimdefs_3 = (RenderAnimDefs) this.renderAnimCache.get((long) i_1);
		}

		if (renderanimdefs_3 != null) {
			renderanimdefs_3.renderAnimId = i_1;
			return renderanimdefs_3;
		} else {
			Index index_5 = this.aClass317_2671;
			byte[] bytes_10;
			synchronized (this.aClass317_2671) {
				bytes_10 = this.aClass317_2671.getFile(SharedConfigsType.RENDER_ANIMS.id, i_1);
			}

			renderanimdefs_3 = new RenderAnimDefs();
			renderanimdefs_3.renderAnimId = i_1;
			renderanimdefs_3.aClass211_2788 = this;
			if (bytes_10 != null) {
				renderanimdefs_3.method3821(new RsByteBuffer(bytes_10), -1552501501);
			}

			SoftCache softcache_9 = this.renderAnimCache;
			synchronized (this.renderAnimCache) {
				this.renderAnimCache.put(renderanimdefs_3, (long) i_1);
				return renderanimdefs_3;
			}
		}
	}

	public void method3617(int i_1) {
		SoftCache softcache_2 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3859(-2032720796);
		}
	}

	public void method3618(byte b_1) {
		SoftCache softcache_2 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3863(1249794319);
		}
	}

	public RenderAnimIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Defaults6Loader defaults6loader_4) {
		this.aClass317_2671 = index_3;
		this.aClass317_2671.filesCount(SharedConfigsType.RENDER_ANIMS.id);
		this.aClass526_2672 = defaults6loader_4;
	}

	static final void sendReportAbusePacket(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.anInt7000 -= 2;
		String string_2 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000];
		String string_3 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1];
		cs2executor_0.intStackPtr -= 2;
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (string_3 == null) {
			string_3 = "";
		}

		if (string_3.length() > 80) {
			string_3 = string_3.substring(0, 80);
		}

		Class184 class184_6 = Class468_Sub20.method12807(-837831842);
		TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4611, class184_6.isaac, -589637310);
		tcpmessage_7.buffer.writeByte(ChatLine.getLength(string_2) + 2 + ChatLine.getLength(string_3));
		tcpmessage_7.buffer.writeString(string_2);
		tcpmessage_7.buffer.writeByte(i_4 - 1);
		tcpmessage_7.buffer.writeByte(i_5);
		tcpmessage_7.buffer.writeString(string_3);
		class184_6.method3049(tcpmessage_7, -187330762);
	}

	static final void method3629(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (!Class456_Sub3.method12682(i_0, (int[]) null, -1707980188)) {
			if (i_7 != -1) {
				client.aBoolArray7443[i_7] = true;
			} else {
				for (int i_9 = 0; i_9 < 107; i_9++) {
					client.aBoolArray7443[i_9] = true;
				}
			}
		} else {
			GroundDecoration.method16094(Class468_Sub8.aClass98Array7889[i_0].method1616(2127300382), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_7 < 0, (byte) 6);
		}

	}

	public static void method3630(int i_0) {
		Queue queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			while (true) {
				Class282_Sub53_Sub1 class282_sub53_sub1_2 = (Class282_Sub53_Sub1) Class236.aQueue2914.poll();
				if (class282_sub53_sub1_2 == null) {
					return;
				}

				class282_sub53_sub1_2.cache(-1123290307);
			}
		}
	}

	public static void method3631(int i_0, int i_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(3, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -28);
	}

}