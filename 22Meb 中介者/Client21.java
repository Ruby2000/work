package Meb;

public class Client21 {
	public static void main(String agrs[]) {
		AbstractChatroom happyChatroom = new ChatGroup();
		Member member1, member2, member3, member4, member5;
		member1 = new DiamondMember("aa");
		member2 = new DiamondMember("bb");
		member3 = new DiamondMember("cc");
		member4 = new DiamondMember("dd");
		member5 = new DiamondMember("ee");

		happyChatroom.register(member1);
		happyChatroom.register(member2);
		happyChatroom.register(member3);
		happyChatroom.register(member4);
		happyChatroom.register(member5);

		member1.sendText("bb", "bb,你好！");
		member2.sendText("aa", "aa,你好！");
		member1.sendText("bb", "bb,今天天气真好呀！");
		member2.sendImage("aa", "一个很大很大的太阳");
		member2.sendImage("aa", "太阳");

	}

}
