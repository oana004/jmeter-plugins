package kg.apc.jmeter.gui;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephane Hoblingre
 */
public class GuiBuilderHelperTest {

    public GuiBuilderHelperTest() {
    }

   @BeforeClass
   public static void setUpClass() throws Exception {
   }

   @AfterClass
   public static void tearDownClass() throws Exception {
   }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   /**
    * Test of getTextAreaScrollPaneContainer method, of class GuiBuilderHelper.
    */
   @Test
   public void testGetTextAreaScrollPaneContainer() {
      System.out.println("getTextAreaScrollPaneContainer");
      JTextArea textArea = new JTextArea();
      JScrollPane result = GuiBuilderHelper.getTextAreaScrollPaneContainer(textArea, 5);
      assertTrue(textArea.getParent().equals(result.getViewport()));
   }

   /**
    * Test of strechButtonToComponent method, of class GuiBuilderHelper.
    */
   @Test
   public void testStrechButtonToComponent() {
      System.out.println("strechButtonToComponent");
      JComponent component = new JTextField();
      JButton button = new JButton();
      GuiBuilderHelper.strechButtonToComponent(component, button);
      assertTrue(component.getHeight() == button.getHeight());
   }

}