public class EnumTest {
    Rainbow rainbow;

    EnumTest(Rainbow rainbow){
        this.rainbow = rainbow;
    }

    public void printColor(){
        switch(rainbow){
            case RED:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case ORANGE:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case YELLOW:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case GREEN:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case BLUE:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case INDIGO:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
            case PURPLE:
                System.out.println("Color: " + rainbow.getName() + " Number: " + rainbow.getRainbowColorNumber());
                break;
        }
    }
}
