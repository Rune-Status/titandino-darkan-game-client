public class LinkedNodeList {

	public static Defaults6Loader DEFAULTS_LOADER_6;
	static int anInt5606;
	Node current;
	public Node head = new Node();

	public void clear() {
		while (true) {
			Node node_1 = this.head.next;
			if (node_1 == this.head) {
				this.current = null;
				return;
			}

			node_1.remove();
		}
	}

	public Node getPrevious() {
		Node node_1 = this.current;
		if (node_1 == this.head) {
			this.current = null;
			return null;
		} else {
			this.current = node_1.next;
			return node_1;
		}
	}

	public Node popTail() {
		Node node_1 = this.head.next;
		if (node_1 == this.head) {
			return null;
		} else {
			node_1.remove();
			return node_1;
		}
	}

	public Node getBack() {
		Node node_1 = this.head.next;
		if (node_1 == this.head) {
			this.current = null;
			return null;
		} else {
			this.current = node_1.next;
			return node_1;
		}
	}

	public LinkedNodeList() {
		this.head.next = this.head;
		this.head.prev = this.head;
	}

	public boolean method7861(int i_1) {
		return this.head.next == this.head;
	}

	public Node getNext() {
		Node node_1 = this.head.prev;
		if (node_1 == this.head) {
			this.current = null;
			return null;
		} else {
			this.current = node_1.prev;
			return node_1;
		}
	}

	public void insertFront(Node node_1) {
		if (node_1.prev != null) {
			node_1.remove();
		}

		node_1.prev = this.head;
		node_1.next = this.head.next;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
	}

	public void insertBack(Node node_1) {
		if (node_1.prev != null) {
			node_1.remove();
		}

		node_1.prev = this.head.prev;
		node_1.next = this.head;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
	}

	public static byte[] method7885(CharSequence charsequence_0, byte b_1) {
		int i_2 = charsequence_0.length();
		byte[] bytes_3 = new byte[i_2];

		for (int i_4 = 0; i_4 < i_2; i_4++) {
			char var_5 = charsequence_0.charAt(i_4);
			if (var_5 > 0 && var_5 < 128 || var_5 >= 160 && var_5 <= 255) {
				bytes_3[i_4] = (byte) var_5;
			} else if (var_5 == 8364) {
				bytes_3[i_4] = -128;
			} else if (var_5 == 8218) {
				bytes_3[i_4] = -126;
			} else if (var_5 == 402) {
				bytes_3[i_4] = -125;
			} else if (var_5 == 8222) {
				bytes_3[i_4] = -124;
			} else if (var_5 == 8230) {
				bytes_3[i_4] = -123;
			} else if (var_5 == 8224) {
				bytes_3[i_4] = -122;
			} else if (var_5 == 8225) {
				bytes_3[i_4] = -121;
			} else if (var_5 == 710) {
				bytes_3[i_4] = -120;
			} else if (var_5 == 8240) {
				bytes_3[i_4] = -119;
			} else if (var_5 == 352) {
				bytes_3[i_4] = -118;
			} else if (var_5 == 8249) {
				bytes_3[i_4] = -117;
			} else if (var_5 == 338) {
				bytes_3[i_4] = -116;
			} else if (var_5 == 381) {
				bytes_3[i_4] = -114;
			} else if (var_5 == 8216) {
				bytes_3[i_4] = -111;
			} else if (var_5 == 8217) {
				bytes_3[i_4] = -110;
			} else if (var_5 == 8220) {
				bytes_3[i_4] = -109;
			} else if (var_5 == 8221) {
				bytes_3[i_4] = -108;
			} else if (var_5 == 8226) {
				bytes_3[i_4] = -107;
			} else if (var_5 == 8211) {
				bytes_3[i_4] = -106;
			} else if (var_5 == 8212) {
				bytes_3[i_4] = -105;
			} else if (var_5 == 732) {
				bytes_3[i_4] = -104;
			} else if (var_5 == 8482) {
				bytes_3[i_4] = -103;
			} else if (var_5 == 353) {
				bytes_3[i_4] = -102;
			} else if (var_5 == 8250) {
				bytes_3[i_4] = -101;
			} else if (var_5 == 339) {
				bytes_3[i_4] = -100;
			} else if (var_5 == 382) {
				bytes_3[i_4] = -98;
			} else if (var_5 == 376) {
				bytes_3[i_4] = -97;
			} else {
				bytes_3[i_4] = 63;
			}
		}

		return bytes_3;
	}

	public static final void method7886(boolean bool_0, int i_1) {
		TCPMessage tcpmessage_2 = Class271.method4828(OutgoingPacket.aClass379_4587, client.aClass184_7475.isaac, 1209499491);
		client.aClass184_7475.method3049(tcpmessage_2, 2048910350);

		for (Class282_Sub44 class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7750(1343073416); class282_sub44_3 != null; class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 30)) {
			if (!class282_sub44_3.method4994(-1056667124)) {
				class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7750(861555487);
				if (class282_sub44_3 == null) {
					break;
				}
			}

			if (class282_sub44_3.anInt8062 == 0) {
				Class351.method6196(class282_sub44_3, true, bool_0, -1206109982);
			}
		}

		if (client.aClass118_7352 != null) {
			Class109.method1858(client.aClass118_7352, (byte) 66);
			client.aClass118_7352 = null;
		}

	}

	public static void method7887(int i_0) {
		Class282_Sub48 class282_sub48_1;
		for (class282_sub48_1 = (Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 94); class282_sub48_1 != null; class282_sub48_1 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-1229768145)) {
			if (class282_sub48_1.aBool8092) {
				class282_sub48_1.method13426((byte) 1);
			}
		}

		for (class282_sub48_1 = (Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 66); class282_sub48_1 != null; class282_sub48_1 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(893135123)) {
			if (class282_sub48_1.aBool8092) {
				class282_sub48_1.method13426((byte) 1);
			}
		}

	}

	static final void method7888(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.anInt7001 -= 2;
		if (cs2executor_0.aLongArray7003[cs2executor_0.anInt7001] >= cs2executor_0.aLongArray7003[cs2executor_0.anInt7001 + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

	static final void method7889(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1390174253) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1346 = Class351.method6193(string_4, cs2executor_2, 1483918243);
		icomponentdefinitions_0.aBool1384 = true;
	}

}