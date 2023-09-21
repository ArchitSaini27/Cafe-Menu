package com.archit.tastefultides;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        ListView dessertsListView=findViewById(R.id.desserts_list_view);
        Dish[] dessertsArray={
                new Dish("Triple Chocolate Brownie", "Decadent chocolate brownie with a rich, fudgy texture and topped with chocolate ganache", 799),
                new Dish("Strawberry Shortcake", "Layers of fluffy sponge cake, fresh strawberries, and whipped cream", 999),
                new Dish("Banana Split Sundae", "Classic dessert with scoops of vanilla, chocolate, and strawberry ice cream, topped with banana slices, whipped cream, and a cherry", 1099),
                new Dish("Lemon Meringue Pie", "Tangy lemon filling in a flaky pie crust, topped with light and fluffy meringue", 1199),
                new Dish("Mango Coconut Panna Cotta", "Smooth and creamy coconut milk-based dessert with fresh mango puree, garnished with toasted coconut flakes", 1299),
                new Dish("Red Velvet Cupcake", "Moist red velvet cupcake topped with cream cheese frosting and a sprinkle of cocoa powder", 699),
                new Dish("Caramel Apple Tart", "Buttery tart shell filled with caramelized apples and drizzled with caramel sauce", 1199),
                new Dish("Raspberry Cheesecake", "Creamy cheesecake with a swirl of tart raspberry sauce, served on a buttery graham cracker crust", 1399),
                new Dish("Pistachio Ice Cream", "Smooth and nutty pistachio-flavored ice cream, perfect for any ice cream lover", 899),
                new Dish("Tiramisu", "Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone cheese, dusted with cocoa powder", 1299),
                new Dish("Chocolate Chip Cookie Dough Sundae", "Vanilla ice cream loaded with chunks of chocolate chip cookie dough, topped with hot fudge and whipped cream", 1099),
                new Dish("Cherry Crumble", "Sweet and juicy cherry filling topped with a buttery crumble topping, served warm with a scoop of vanilla ice cream", 1199),
                new Dish("Key Lime Pie", "Tangy and refreshing pie made with freshly squeezed key lime juice in a buttery graham cracker crust", 999),
                new Dish("Black Forest Cake", "Layers of moist chocolate cake filled with cherries and whipped cream, covered in chocolate shavings", 1499),
                new Dish("Salted Caramel Chocolate Tart", "Rich chocolate ganache filling with a hint of salted caramel, served in a buttery tart shell", 1399)

        };

        ArrayAdapter<Dish> dessertsArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dessertsArray);
        dessertsListView.setAdapter(dessertsArrayAdapter);
    }
}