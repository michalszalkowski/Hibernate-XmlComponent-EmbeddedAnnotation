package pl.btbw.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class PostAnnotationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Embedded
	private PostGroup postGroup = new PostGroup();

	public PostAnnotationEntity() {
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
