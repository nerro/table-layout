package info.clearthought.layout;

/**
 * TableLayoutConstants define the constants used by all the TableLayout classes.
 *
 * @version 3.0 February 15, 2004
 * @author Daniel E. Barbalace
 */
public interface TableLayoutConstants {
  /** Indicates that the component is left justified in its cell */
  int LEFT = 0;

  /** Indicates that the component is top justified in its cell */
  int TOP = 0;

  /** Indicates that the component is centered in its cell */
  int CENTER = 1;

  /** Indicates that the component is full justified in its cell */
  int FULL = 2;

  /** Indicates that the component is bottom justified in its cell */
  int BOTTOM = 3;

  /** Indicates that the component is right justified in its cell */
  int RIGHT = 3;

  /**
   * Indicates that the component is leading justified in its cell. Leading justification means components are left
   * justified if their container is left-oriented and right justified if their container is right-oriented. Trailing
   * justification is opposite. see {@link java.awt.Component#getComponentOrientation}
   */
  int LEADING = 4;

  /**
   * Indicates that the component is trailing justified in its cell. Trailing justification means components are right
   * justified if their container is left-oriented and left justified if their container is right-oriented. Leading
   * justification is opposite. see {@link java.awt.Component#getComponentOrientation}
   */
  int TRAILING = 5;

  /** Indicates that the row/column should fill the available space */
  double FILL = -1.0;

  /**
   * Indicates that the row/column should be allocated just enough space to accommodate the preferred size of all
   * components contained completely within this row/column.
   */
  double PREFERRED = -2.0;

  /**
   * Indicates that the row/column should be allocated just enough space to accommodate the minimum size of all
   * components contained completely within this row/column.
   */
  double MINIMUM = -3.0;
}
