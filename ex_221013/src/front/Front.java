package front;

import back.BackEnd;

public class Front {
	private String title;

	public Front() {
		this.title = this.makeTitle();

		// BackEnd backend = new BackEnd();

	}

	public String makeTitle() {

		StringBuffer title = new StringBuffer();
		title.append("#####################################\n\n");
		title.append("      JS FrameWork Calculator v1.0\n");
		title.append("                   Designed By JW\n\n");
		title.append("#####################################\n\n");

		return title.toString();

	}

	public String makeMessage(String text) {
		StringBuffer message = new StringBuffer();
		message.append("[");
		message.append("text");
		message.append("]");
		return message.toString();
	}

	public String makeSubmenu(String subMenuTitle, String Menu) {
		StringBuffer subMenu = new StringBuffer();
		subMenu.append("[");
		subMenu.append("subMenuTitle");
		subMenu.append("]__________________________________\n");
		subMenu.append("menu");
		subMenu.append("");
		return subMenu.toString();
		
		
	}
	public void aaa() {
		System.out.print("www." + this.title);
	}

}
