package com.archit.tastefultides;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        ListView startersList = findViewById(R.id.starter_list_view);

        Dish[] dishes = {
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299),
                new Dish("Grilled Salmon with Lemon Butter Sauce", "Freshly grilled salmon fillet topped with tangy lemon butter sauce", 1599),
                new Dish("Mediterranean Chicken Salad", "Mixed greens, grilled chicken, cherry tomatoes, cucumbers, olives, and feta cheese tossed in a zesty Mediterranean dressing", 1299),
                new Dish("Beef Stir-Fry with Vegetables", "Tender beef strips stir-fried with colorful vegetables in a savory sauce, served over steamed rice", 1499),
                new Dish("Vegetable Lasagna", "Layers of lasagna noodles, sautéed vegetables, marinara sauce, and melted cheese, baked to perfection", 1399),
                new Dish("Chocolate Lava Cake", "Warm and decadent chocolate cake with a molten chocolate center, served with a scoop of vanilla ice cream", 999)
        };

        ArrayAdapter<Dish> startersAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(startersAdapter);
    }
}