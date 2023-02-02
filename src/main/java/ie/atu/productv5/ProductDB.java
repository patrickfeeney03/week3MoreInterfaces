package ie.atu.productv5;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("callaita")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Urban/Trap song of the Year");
            myMusic.setPrice(10.0);
            myMusic.setArtist("Bad Bunny");
            myMusic.setLabel("Rimas");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("life goes on")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("\"Life Goes On\" is a song by American singer-songwriter Oliver Tree. It was " +
                    "released on May 28, 2021, through Atlantic Records, as the second single from the deluxe version " +
                    "of his debut studio album, Ugly Is Beautiful (2020). Tree and DJ Getter co-wrote and produced " +
                    "\"Life Goes On\".");
            myMusic.setPrice(15.0);
            myMusic.setArtist("Oliver Tree");
            myMusic.setLabel("Atlantic");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("deceptacon")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Le Tigre is the debut studio album of American music trio Le Tigre. It was released " +
                    "October 25, 1999[2] on Mr. Lady Records. The album combined pop music with the band's feminist " +
                    "political lyrics. It received positive reviews from music critics.");
            myMusic.setPrice(1.0);
            myMusic.setArtist("Le Tigre");
            myMusic.setLabel("Deceptacon");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("sony bravia")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("What if your TV thought the way we do? That's exactly what Sony have tried to replicate" +
                    " with the human-like Cognitive Processor XR inside this Sony A75 TV. Everything looks natural, with" +
                    " plenty of detail and depth. It's like having a master filmmaker tweaking the picture just for you." +
                    " As if the OLED panel wasn't enough, XR OLED Contrast Pro technology gives a further boost to the" +
                    " colour and contrast. XR TRILUMINOS Pro recreates a wider palette of colours, delivering beautiful " +
                    "hues, even in dark scenes. And with Acoustic Surface Audio, the screen is the speaker, making it " +
                    "seem like the sound is coming from where the action is happening on-screen.");
            myTV.setPrice(1000);
            myTV.setManufacture("Sony");
            myTV.setScreenSize(32);
            p = myTV;
        } else if (productCode.equalsIgnoreCase("samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Enjoy all the content you love in the best possible resolution on the Samsung " +
                    "UE43AU7100KXXU 43\" Smart 4K Ultra HD HDR LED TV. The Crystal 4K Processor upscales what " +
                    "you're watching to give you the best 4K picture.\n");
            myTV.setPrice(6000);
            myTV.setManufacture("Samsung");
            myTV.setScreenSize(40);
            p = myTV;
        } else if (productCode.equalsIgnoreCase("lg")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Featuring AI Sound Pro and 4K Ultra HD resolution, this LG UQ75 TV will bring all your" +
                    " favourite films and shows to life.");
            myTV.setPrice(500);
            myTV.setManufacture("LG");
            myTV.setScreenSize(22);
            p = myTV;
        }

        return p;
    }
}

