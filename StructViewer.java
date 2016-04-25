package com.kit.chen;

import javax.swing.*;

public class StructViewer
implements Runnable
{
  public static final String WINDOW_HEADER = "Struct viewer";
  
  public static void main ( String ... args ) {
    SwingUtilities .invokeLater ( new StructViewer (  ) )  
  }
  
  public void run (  ) {
    JFrame f = new JFrame ( WINDOW_HEADER );
    
    createUI ( f );
    
    f .setDefaultCloseOperation ( DISPOSE_ON_CLOSE );
    f .pack (  );
    f .setVisible ( true );
  }
  
  private static void createUI ( JFrame f ) {
    JPanel treeView = new JPanel (  );
    TreeComponent treeComponent = new TreeComponent (  );
    treeView .add ( treeCom );
    JPanel controls = new JPanel (  );
    f .setLayout ( LayoutManager .BORDER_LAYOUT );
    f .add ( treeView, BorderLayout .CENTER );
    f .add ( controls, BorderLayout .EAST );
  }
}
