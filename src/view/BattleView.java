package view;

import controller.Controller;
import model.Model;
import model.Observer;

public class BattleView extends View implements Observer{
	private Model myModel;
	private Controller myController;
	public BattleView(Model m){
		myModel=m;
		myController = null;
		initComponents();
	}

	@Override
	public void update() {
		//Update all the variable values within the View!
	}
	
	 private void initComponents() {

	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        playerPokemonIcon = new javax.swing.JLabel();
	        playerNameLabel = new javax.swing.JLabel();
	        playerHPBar = new javax.swing.JProgressBar();
	        enemyNameLabel = new javax.swing.JLabel();
	        enemyPokemonIcon = new javax.swing.JLabel();
	        EnemyHPBar = new javax.swing.JProgressBar();
	        jSeparator2 = new javax.swing.JSeparator();
	        background = new javax.swing.JLabel();

	        setMinimumSize(new java.awt.Dimension(1080, 680));
	        setPreferredSize(new java.awt.Dimension(1080, 680));

	        jButton1.setText("Attack");

	        jButton2.setText("Items");
	        jButton2.setToolTipText("");

	        jButton3.setText("Run");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButton4.setText("Swap");
	        //if (myModel.getPlayer().blahblah)
	        playerPokemonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/bulbasaur200.png")));
	        playerPokemonIcon.setText("Pokemon");
	        playerPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));

	        playerNameLabel.setText("Name");

	        playerHPBar.setValue(25);

	        enemyNameLabel.setText("Name");

	        enemyPokemonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/bulbasaur200.png")));
	        enemyPokemonIcon.setText("Pokemon");
	        enemyPokemonIcon.setMaximumSize(new java.awt.Dimension(200, 200));
	        enemyPokemonIcon.setMinimumSize(new java.awt.Dimension(200, 200));
	        enemyPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));

	        EnemyHPBar.setValue(25);

	        background.setText("Background");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jSeparator2)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(playerHPBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(playerPokemonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(background)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 748, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(jButton4))
	                                .addGap(6, 6, 6)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(jButton1)))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                .addComponent(enemyPokemonIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(EnemyHPBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(enemyNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(EnemyHPBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(background))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(enemyPokemonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(enemyNameLabel)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(playerHPBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(playerPokemonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(playerNameLabel)
	                .addGap(1, 1, 1)
	                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1)
	                    .addComponent(jButton3))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton2)
	                    .addComponent(jButton4))
	                .addGap(21, 21, 21))
	        );
	    }// </editor-fold>                    
	

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        


	    // Variables declaration - do not modify                     
	    private javax.swing.JProgressBar EnemyHPBar;
	    private javax.swing.JLabel background;
	    private javax.swing.JLabel enemyNameLabel;
	    private javax.swing.JLabel enemyPokemonIcon;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JSeparator jSeparator2;
	    private javax.swing.JProgressBar playerHPBar;
	    private javax.swing.JLabel playerNameLabel;
	    private javax.swing.JLabel playerPokemonIcon;
	    // End of variables declaration 
	
}
