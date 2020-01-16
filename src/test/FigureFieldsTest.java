package test;
import com.figurefields.figure_choice.FigureChoiceDirector;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.two_dim.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class FigureFieldsTest {

    @Test
    public void czypoprawnazzakresufloat(){
        InputValidator valid = new InputValidator();
        assertTrue(valid.isValid(8));
    }

    @Test
    public void ujemnyparametrwejsciowy(){
        InputValidator valid = new InputValidator();
        Assert.assertFalse(valid.isValid(-8));
    }

    @Test
    public void poleKwadratu(){
        Square area = new Square(5);
        Assert.assertNotNull(area.getArea());
    }

    @Test
    public void czystworzycKwadrat(){
        FigureChoiceDirector director = new FigureChoiceDirector(true);
        Assert.assertTrue(director.selectFigure(1));
    }

    @Test
    public void wybormenuzleponadzakres(){
        FigureChoiceDirector director = new FigureChoiceDirector(true);
        Assert.assertFalse(director.selectFigure(20));
    }

    @Test
    public void wybormenuzleponizejzakesu(){
        FigureChoiceDirector director = new FigureChoiceDirector(true);
        Assert.assertFalse(director.selectFigure(-5));
    }

    @Test
    public void czydobrzepoliczypolekwadratu(){
        Square area = new Square(4);
        Assert.assertEquals(area.getArea(),16);
    }

    @Test
    public void czydobrzepoliczypoletrapezu(){
        Trapeze area = new Trapeze(2,4,1);
        Assert.assertEquals(area.getArea(),3);
    }

    @Test
    public void czydobrzepoliczypoletrojkata(){
        Triangle area = new Triangle(4,2);
        Assert.assertEquals(area.getArea(),4);
    }

    @Test
    public void czydobrzepoliczypoleprostokata(){
        Rectangle area = new Rectangle(4,2);
        Assert.assertEquals(area.getArea(),8);
    }

    @Test
    public void czydobrzepoliczypolehexagonu(){
        Hexagon area = new Hexagon(2);
        float aa=(float)area.getArea();
        float expect=(float)10.39;
        float roznica=expect-aa;
        boolean mniejsza=(roznica<0.01);
        Assert.assertTrue(mniejsza);
    }

}
