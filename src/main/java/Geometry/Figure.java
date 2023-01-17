package Geometry;

public class Figure {

    public Figure createFigure(Figures figure){

        switch (figure){
            case SQUARE -> {
                return new Square(10);
            }
            case RECTANGLE -> {
                return new Rectangle(12,23);
            }

        }

        return null;
    }

}


