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
    TreeComponentModel treeModel = new TreeComponentModel (  );
    TreeComponent treeComponent = new TreeComponent ( treeModel );
    treeView .add ( treeComponent );
    
    JPanel controls = new JPanel (  );
    JButton createTree = new JButton (  );
    JButton clear = new JButton (  );
    JComboBox treeType = new JComboBox (  ); //random, progression, from file, empty
    JCheckBox isSorted = new JCheckBox (  );
    //Add this controls on the controls panel immidiately or woth subpanels
    
    //How to add this action to the bottons through constructor? 
    Action createTreeAction = new Action (  ) {
      public void actionPerformed ( ActionEvent e ) {
        if ( e .getSource () == createTree )
          treeModel .createNewTree (  );
        else if ( e .getSource () == clear )
          treeModel .clear (  );
      }
    }
    
    treeType .addItemChangedListener (
      new StateChangedListerner (  ) {
        public void stateChanged (ItemEvent e) {
          treeModel .setTreeType ( e .getSelectedItem (  ) );
        }
      }
    );
    treeType .addActionListener ( createA);
    
    isSorted .add
    
    f .setLayout ( LayoutManager .BORDER_LAYOUT );
    f .add ( treeView, BorderLayout .CENTER );
    f .add ( controls, BorderLayout .EAST );
  }
}
