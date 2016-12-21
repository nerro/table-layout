package info.clearthought.layout;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TableLayoutConstraintsTest {

  @Test
  public void constructorWithoutParameters_shouldSetVerticalAlignmentToFULL() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int verticalAlign = constraints.vAlign;

    assertThat(verticalAlign, equalTo(TableLayoutConstants.FULL));
  }

  @Test
  public void constructorWithoutParameters_shouldSetHorizontalAlignmentToFULL() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int horizontalAlign = constraints.hAlign;

    assertThat(horizontalAlign, equalTo(TableLayoutConstants.FULL));
  }

  @Test
  public void constructorWithoutParameters_shouldSetColumn1ToZero() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int column1 = constraints.col1;

    assertThat(column1, equalTo(0));
  }

  @Test
  public void constructorWithoutParameters_shouldSetColumn2ToZero() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int column2 = constraints.col2;

    assertThat(column2, equalTo(0));
  }

  @Test
  public void constructorWithoutParameters_shouldSetRow1ToZero() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int row1 = constraints.row1;

    assertThat(row1, equalTo(0));
  }

  @Test
  public void constructorWithoutParameters_shouldSetRow2ToZero() {
    TableLayoutConstraints constraints = new TableLayoutConstraints();

    int row2 = constraints.row2;

    assertThat(row2, equalTo(0));
  }
}
