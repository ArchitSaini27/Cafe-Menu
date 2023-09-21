package com.archit.tastefultides;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        ListView mainCoursesList=findViewById(R.id.main_courses_list_view);

        Dish[] mainCoursesDish={
                new Dish("Spicy Thai Basil Chicken", "Tender chicken stir-fried with aromatic Thai basil leaves and spices", 1499),
                new Dish("Mediterranean Quinoa Salad", "Colorful salad with quinoa, cherry tomatoes, cucumbers, feta cheese, and a tangy lemon dressing", 999),
                new Dish("Grilled Salmon with Dill Sauce", "Grilled salmon fillet topped with creamy dill sauce, served with roasted vegetables", 1799),
                new Dish("Classic Margherita Pizza", "Thin-crust pizza topped with fresh tomatoes, mozzarella cheese, and basil leaves", 1299),
                new Dish("Braised Beef Short Ribs", "Tender beef short ribs slow-cooked in a savory sauce, served with mashed potatoes", 1899),
                new Dish("Vegetable Biryani", "Fragrant basmati rice cooked with mixed vegetables and aromatic Indian spices", 1399),
                new Dish("Pesto Pasta with Grilled Shrimp", "Al dente pasta tossed in homemade basil pesto sauce, garnished with grilled shrimp", 1699),
                new Dish("Stuffed Bell Peppers", "Bell peppers stuffed with a flavorful mixture of ground beef, rice, and spices, baked to perfection", 1499),
                new Dish("Japanese Ramen Noodles", "Hearty bowl of ramen noodles in a savory broth, topped with sliced pork, bamboo shoots, and a soft-boiled egg", 1599),
                new Dish("Chocolate Lava Cake", "Warm chocolate cake with a molten chocolate center, served with vanilla ice cream", 799)
        };
        ArrayAdapter<Dish> mainCourseArrayAdaptor=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCoursesDish);
        mainCoursesList.setAdapter(mainCourseArrayAdaptor);

    }
}
