import java.util.Collection;
import java.util.Iterator;

public class NodeCollection implements Iterable, Collection {

	Node current;

	public Node tail = new Node();

	public void append(Node node_1) {
		if (node_1.prev != null) {
			node_1.remove();
		}
		node_1.prev = this.tail.prev;
		node_1.next = this.tail;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
	}

	public Node popHead() {
		Node node_2 = this.tail.next;
		if (node_2 == this.tail) {
			return null;
		} else {
			node_2.remove();
			return node_2;
		}
	}

	void method8062(NodeCollection nodecollection_1, Node node_2) {
		Node node_4 = this.tail.prev;
		this.tail.prev = node_2.prev;
		node_2.prev.next = this.tail;
		if (node_2 != this.tail) {
			node_2.prev = nodecollection_1.tail.prev;
			node_2.prev.next = node_2;
			node_4.next = nodecollection_1.tail;
			nodecollection_1.tail.prev = node_4;
		}
	}

	public void method8063(NodeCollection nodecollection_1) {
		if (this.tail.next != this.tail) {
			this.method8062(nodecollection_1, this.tail.next);
		}
	}

	public Iterator iterator() {
		return new NodeIterator(this);
	}

	public Node method8065(int i_1) {
		return this.method8066((Node) null);
	}

	Node method8066(Node node_1) {
		Node node_3;
		if (node_1 == null) {
			node_3 = this.tail.prev;
		} else {
			node_3 = node_1;
		}
		if (node_3 == this.tail) {
			this.current = null;
			return null;
		} else {
			this.current = node_3.prev;
			return node_3;
		}
	}

	public Node next(int i_1) {
		Node node_2 = this.current;
		if (node_2 == this.tail) {
			this.current = null;
			return null;
		} else {
			this.current = node_2.next;
			return node_2;
		}
	}

	public Node method8068(byte b_1) {
		Node node_2 = this.current;
		if (node_2 == this.tail) {
			this.current = null;
			return null;
		} else {
			this.current = node_2.prev;
			return node_2;
		}
	}

	public int size() {
		int i_2 = 0;
		for (Node node_3 = this.tail.next; node_3 != this.tail; node_3 = node_3.next) {
			++i_2;
		}
		return i_2;
	}

	public boolean add(Object object_1) {
		return this.add((Node) object_1);
	}

	Node[] method8070() {
		Node[] arr_2 = new Node[this.size()];
		int i_3 = 0;
		for (Node node_4 = this.tail.next; node_4 != this.tail; node_4 = node_4.next) {
			arr_2[i_3++] = node_4;
		}
		return arr_2;
	}

	public void clear() {
		this.method8118(913774407);
	}

	public boolean isEmpty() {
		return this.hasNext(2128482398);
	}

	public boolean contains(Object object_1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method8070();
	}

	public Object[] toArray(Object[] arr_1) {
		int i_2 = 0;
		for (Node node_3 = this.tail.next; node_3 != this.tail; node_3 = node_3.next) {
			arr_1[i_2++] = node_3;
		}
		return arr_1;
	}

	boolean add(Node node_1) {
		this.append(node_1);
		return true;
	}

	public boolean containsAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection_1) {
		throw new RuntimeException();
	}

	public boolean equals(Object object_1) {
		return super.equals(object_1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	Node method8076(Node node_1) {
		Node node_3;
		if (node_1 == null) {
			node_3 = this.tail.next;
		} else {
			node_3 = node_1;
		}
		if (node_3 == this.tail) {
			this.current = null;
			return null;
		} else {
			this.current = node_3.next;
			return node_3;
		}
	}

	public boolean hasNext(int i_1) {
		return this.tail.next == this.tail;
	}

	public Node head() {
		return this.method8076((Node) null);
	}

	public void method8098(Node node_1) {
		if (node_1.prev != null) {
			node_1.remove();
		}
		node_1.prev = this.tail;
		node_1.next = this.tail.next;
		node_1.prev.next = node_1;
		node_1.next.prev = node_1;
	}

	public NodeCollection() {
		this.tail.next = this.tail;
		this.tail.prev = this.tail;
	}

	public void method8118(int i_1) {
		while (this.tail.next != this.tail) {
			this.tail.next.remove();
		}
	}

	public boolean remove(Object object_1) {
		throw new RuntimeException();
	}

	public static void method8144(boolean bool_0) {
		if (Comparable_Sub1.aClass306_3771 == null) {
			Class165.method2852(-1959846530);
		}
		if (bool_0) {
			Comparable_Sub1.aClass306_3771.method5419();
		}
	}

	static boolean method8145() {
		try {
			Class395 class395_2 = new Class395();
			byte[] bytes_3 = class395_2.method6764(Class299.aByteArray3543);
			Class103_Sub1.method14490(bytes_3, (byte) -104);
			boolean bool_1 = true;
			return bool_1;
		} catch (Exception exception_4) {
			return false;
		}
	}

	public static final void method8146() {
		if (!client.aBool7269) {
			client.aFloat7266 += (-24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}
	}

	public static void method8148() {
		Class253.method4330(Class393.preferences.aPreference_Sub10_8215.method12691(722134232) == 1);
		Class320.aClass253_3723 = Class253.method4331(Class351.gameCanvas, 0, 22050);
		Class42_Sub1.method14563(Node_Sub20_Sub10.method15262((Node_Sub15_Sub2) null, 191335579), (short) 27702);
		ShaderDecoder.aClass253_1008 = Class253.method4331(Class351.gameCanvas, 1, 2048);
		Class79.aNode_Sub15_Sub4_783 = new Node_Sub15_Sub4();
		ShaderDecoder.aClass253_1008.method4329(Class79.aNode_Sub15_Sub4_783);
		Class119.aClass344_1460 = new Class344(22050, Class253.anInt3129);
		GraphicsPreference.method12658(552328415);
	}
}
