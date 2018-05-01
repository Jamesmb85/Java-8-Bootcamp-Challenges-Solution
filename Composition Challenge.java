// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.


package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //create an object of type wall and initialize it with the new keyword
    //instantiation via new operator and
    //initialization via overload constructor of class wall
    wall north = new wall("blue");
    wall south = new wall("grey");
    wall east = new wall("black");
    wall west = new wall("purple");

    ceiling top = new ceiling("Concrete", 10);

    bed king = new bed("King", "China");

    lamp standless = new lamp(50, "wide base");


    //create a Bedroom from the classes above
    Bedroom bedroom = new Bedroom("James Room", north, south, east, west, top, king, standless);

    //call makebed method
    bedroom.makeBed();


    }


}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class Bedroom {
    //variables
    private String name;
    //wall, ceiling, bed, bed, and lamp are all classes
    private wall north;
    private wall south;
    private wall east;
    private wall west;
    private ceiling top;
    private bed king;
    private lamp standless;

    //overload constructor
    public Bedroom(String name, wall north, wall south, wall east, wall west, ceiling top, bed king, lamp standless) {
        this.name = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.top = top;
        this.king = king;
        this.standless = standless;
    }

    //getters
    public String getName() {
        return name;
    }

    public wall getNorth() {
        return north;
    }

    public wall getSouth() {
        return south;
    }

    public wall getEast() {
        return east;
    }

    public wall getWest() {
        return west;
    }

    public ceiling getTop() {
        return top;
    }

    public bed getKing() {
        return king;
    }

    public lamp getStandless() {
        return standless;
    }

    //method
    public void makeBed(){
        System.out.println("makeBed method called from Bedroom class");
        king.make();//call make method
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class wall {
    private String paintcolor;

    //overload constructor
    public wall(String paintcolor) {
        this.paintcolor = paintcolor;
    }

    //getters
    public String getPaintcolor() {
        return paintcolor;
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class ceiling {
    private String material;
    private int height;

    //overload constructor
    public ceiling(String material, int height) {
        this.material = material;
        this.height = height;
    }

    //getters
    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class bed {
    private String size;
    private String manufacturer;

    //overload constructor
    public bed(String size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    //getters
    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    //methods
    public void make(){
        System.out.println("I made my bed this morning!!!");
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.company;

public class lamp {
    private int height;
    private String style;

    //overload constructor
    public lamp(int height, String style) {
        this.height = height;
        this.style = style;
    }

    //getters
    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }

    //method
    public void power(){
        System.out.println("Lamp was powered on!!!");
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
