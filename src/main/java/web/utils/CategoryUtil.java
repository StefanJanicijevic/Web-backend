package web.utils;

import web.DTO.Category;

public class CategoryUtil {
    public static boolean isEmpty(Category category) {
        return  category == null || category.getId() == 0;
    }
}


