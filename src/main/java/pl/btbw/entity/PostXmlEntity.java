package pl.btbw.entity;

public class PostXmlEntity {

	private int id;

	private String name;

	private PostGroup postGroup = new PostGroup();

	public PostXmlEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PostGroup getPostGroup() {
		return postGroup;
	}

	public void setPostGroup(PostGroup postGroup) {
		this.postGroup = postGroup;
	}
}
