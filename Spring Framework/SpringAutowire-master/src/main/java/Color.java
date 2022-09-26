
// Color.java will be the bean that we will use to autowire in all possible ways.
// It is a class that represents the color of an animal. It has two attributes,
// the baseColor that is the base color of an animal’s skin and the textureColor
// that is the texture color of an animal’s skin.

public class Color {

    private String baseColor;
    private String textureColor;

    public String getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor;
    }

    public String getTextureColor() {
        return textureColor;
    }

    public void setTextureColor(String textureColor) {
        this.textureColor = textureColor;
    }

    @Override
    public String toString() {
        return baseColor + " base skin color and " + textureColor + " texture color.";
    }
}

