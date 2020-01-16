package test;

import com.figurefields.figure_choice.FigureChoiceDirector;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figure_choice.choices.SquareChoice;
import com.figurefields.figures.two_dim.Square;
import com.figurefields.figures.two_dim.Trapeze;
import com.figurefields.figures.two_dim.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

import static org.testng.Assert.assertTrue;


public class FigureFieldsTest {

    @Test
    public void czypoprawna(){
        InputValidator valid = new InputValidator();
        assertTrue(valid.isValid(8));
    }

    @Test
    public void czypoprawnaujemna(){
        InputValidator valid = new InputValidator();
        Assert.assertFalse(valid.isValid(-8));
    }

    @Test
    public void czydasiestworzycKwadrat(){
        Square area = new Square(5);
        Assert.assertNotNull(area.getArea());
    }

    @Test
    public void czytworzycKwadrat(){
        FigureChoiceDirector director = new FigureChoiceDirector(true);
        Assert.assertTrue(director.selectFigure(1));
    }

    @Test
    public void czytworzycKwadratzle(){
        FigureChoiceDirector director = new FigureChoiceDirector(true);
        Assert.assertFalse(director.selectFigure(20));
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
}
