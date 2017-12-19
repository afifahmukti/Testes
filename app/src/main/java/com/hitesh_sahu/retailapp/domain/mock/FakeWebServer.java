package com.hitesh_sahu.retailapp.domain.mock;

import com.hitesh_sahu.retailapp.model.CenterRepository;
import com.hitesh_sahu.retailapp.model.entities.Product;
import com.hitesh_sahu.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 /**
   * Created by hitesh_sahu on 29/11/2017
*/



public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Mukena Rajut",
                        "Pakaian Wanita",
                        "10%",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Kurma Impor",
                        "Produk Kurma",
                        "15%",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Ovens
        productlist
                .add(new Product(
                        "Paket Kain Ikhrom",
                        "Kualitas super",
                        "deskripsiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii",
                        "500000",
                        "10",
                        "429000",
                        "0",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                        "ikram_1"));

        productlist
                .add(new Product(
                        "Paket Kain Ikhrom 1",
                        "Kain ikrom nan lembut",
                        "lalalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.",
                        "500000",
                        "10",
                        "429000",
                        "0",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                        "ikram_2"));

        productMap.put("Pakaian Ikhrom", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(
                "MUKENA",
                "Mukena Rajut Halus",
                "------------------------------------------------------------",
                "160000",
                "12",
                "139090",
                "0",
                "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                "tv_1"));

        tvList.add(new Product(
                "MUKENA",
                "==========================================",
                "deskripsiiii",
                "17000",
                "12",
                "13990",
                "0",
                "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                "tv_2"));

        productMap.put("Mukena", tvList);

        productlist = new ArrayList<Product>();

        // Vaccum Cleaner
        productlist
                .add(new Product(
                        "Koko 1 ",
                        "baju pria",
                        "--------------------------------------------------",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                        "v_cleaner_1"));

        productlist
                .add(new Product(
                        "Koko 2",
                        "baju pria",
                        "--------------------------------------------------",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                        "v_cleaner_2"));

        productlist
                .add(new Product(
                        "Koko 3",
                        "baju pria",
                        "--------------------------------------------------",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://3.bp.blogspot.com/-twV2lBerK6k/WigIFUpQGKI/AAAAAAAATYY/1LXlKrCSu6MFvrrJguG-ZI-OHFqNb_MowCLcBGAs/s1600/ll.jpg",
                        "v_cleaner_3"));

        productMap.put("Baju Koko", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Table
        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img6a.flixcart.com/image/coffee-table/q/f/4/ct15bl-mdf-royal-oak-dark-400x400-imaeehkd8xuheh2u.jpeg",
                        "table_1"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
                        "table_2"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",

                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/u/n/p/brass-table0016-rosewood-sheesham-zameerwazeer-beige-400x400-imaedwk5ksph9ut2.jpeg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img6a.flixcart.com/image/coffee-table/v/h/h/side-tb-53-ad-particle-board-debono-acacia-dark-matt-400x400-imaecnctfgjahsnu.jpeg",
                        "table_4"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
                        "table_5"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "http://img5a.flixcart.com/image/coffee-table/k/y/h/1-particle-board-wood-an-wood-coffee-400x400-imae7uvzqsf4ynan.jpeg",
                        "table_6"));

        productMap.put("Tables", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/5/b/b/boss-moda-chair-br1088-comf-on-xxxl-400x400-imae9k78vg8gjh3q.jpeg",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/e/f/p/flversaossblu-stainless-steel-nilkamal-400x400-imaeeptqczc5kbjg.jpeg",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/7/w/b/chr-01-fab-homez-xxxl-400x400-imae9qnbfwr9vkk4.jpeg",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyhzefdzgz.jpeg",
                        "chair_4"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyytefgvz7.jpeg",
                        "chair_5"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/j/y/q/adpn-d021-pp-adiko-400x400-imaee2vrg9bkkxjg.jpeg",
                        "chair_6"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
                        "chair_7"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img6a.flixcart.com/image/bean-bag/t/8/n/fk0100391-star-xxxl-400x400-imae72dsb5h2r9uj.jpeg",
                        "chair_8"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/3/h/w/rydclassicgreenl-rockyard-large-400x400-imae6zfaz6qzj3jd.jpeg",
                        "chair_9"));

        productMap.put("Chairs", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Metal Free Standing Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
                        "almirah_6"));

        productMap.put("Almirah", productlist);

        productMap.put("Almirah", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }



    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
