package codeamon.ekthesi.Common;

/**
 * Created by OsmanKorcan on 1.5.2016.
 */
public class CategoryList {
    private int id;
    private int projectId;
    private int mainCategoryId;
    private String categoryName;
    private int type;

    public CategoryList(int id, int projectId, int mainCategoryId, String categoryName, int type) {
        this.id = id;
        this.projectId = projectId;
        this.mainCategoryId = mainCategoryId;
        this.categoryName = categoryName;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(int mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
