package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import controller.AttackController;
import model.Observer;
import statusEffects.Burn;
import statusEffects.Frozen;
import statusEffects.Poison;
/**
 * This view will display a list of the attacks that the selected pokemon can use.
 * @author Adam Pine
 *
 */
public class SelectAttackView extends View implements Observer{
	/**
	 * Constructor, attaches itself to the model, when it creates and executes it's controller, it will detach itself as well.
	 */
	public SelectAttackView(){
		myController = null;
		initComponents();
		myModel.attach(this);
	}
	/**
	 * Create all of the Components
	 */
	private void initComponents() {
		//declarations
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
        PlayerStatusIcon = new javax.swing.JLabel();
        EnemyStatusIcon = new javax.swing.JLabel();
        
        String atkStr1 = "Error";
        String atkStr2 = "Error";
        String atkStr3 = "Error";
        String atkStr4 = "Error";
        
        setMinimumSize(new java.awt.Dimension(1080, 680));
        setPreferredSize(new java.awt.Dimension(1080, 680));
        /**
         * Set up the name of the attacks section.
         */
             atkStr1 = myModel.getPlayer().getSelectedPokemon().getMoves().get(0).getClass().getSimpleName();
             atkStr2 = myModel.getPlayer().getSelectedPokemon().getMoves().get(1).getClass().getSimpleName();
             atkStr3 = myModel.getPlayer().getSelectedPokemon().getMoves().get(2).getClass().getSimpleName();
             atkStr4 = myModel.getPlayer().getSelectedPokemon().getMoves().get(3).getClass().getSimpleName();
        /**
         * Assemble the buttons!
         */
        jButton1.setText(atkStr1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt, jButton1);
            }
        });

        jButton2.setText(atkStr2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt, jButton2);
            }
        });

        jButton3.setText(atkStr3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt, jButton3);
            }
        });

        jButton4.setText(atkStr4);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt, jButton4);
            }
        });
        
        String str = "resources/"+myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8)+"200.png";
        ImageIcon img = new ImageIcon(getClass().getResource(str));
        playerPokemonIcon.setIcon(img);
        playerPokemonIcon.setText("Pokemon");
        playerPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));

        playerNameLabel.setText(myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8));
        double hp = myModel.getPlayer().getSelectedPokemon().getCurrentHealth();
        double max = myModel.getPlayer().getSelectedPokemon().getMaxHealth();
        double hpPercent = (hp/max)*100;
        playerHPBar.setValue((int)hpPercent);

		if (myModel.getPlayer().getSelectedPokemon().getStatus() instanceof Burn){
			PlayerStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/fireIC_Big.png")));
			PlayerStatusIcon.setVisible(true);
		}else if (myModel.getPlayer().getSelectedPokemon().getStatus() instanceof Poison){
			PlayerStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/PoisonIC_Big.png")));
			PlayerStatusIcon.setVisible(true);			
		}else if (myModel.getPlayer().getSelectedPokemon().getStatus() instanceof Frozen){
			PlayerStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/IceIC_Big.png")));
			PlayerStatusIcon.setVisible(true);
		}else{
			PlayerStatusIcon.setVisible(false);
		}
		
		/**
		 * Enemy Section
		 * Does the calculations for enemy health and icons.
		 */
		enemyNameLabel.setText(myModel.getComputer().getSelectedPokemon().getClass().getName().substring(8));
		str = "resources/" + myModel.getComputer().getSelectedPokemon().getClass().getName().substring(8)
				+ "200.png";		
		img = new ImageIcon(getClass().getResource(str));
		enemyPokemonIcon.setIcon(img);
		enemyPokemonIcon.setMaximumSize(new java.awt.Dimension(200, 200));
		enemyPokemonIcon.setMinimumSize(new java.awt.Dimension(200, 200));
		enemyPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));
		// Enemy HP bar
		EnemyHPBar.setValue((int)(((double)myModel.getComputer().getSelectedPokemon().getCurrentHealth()/(double)myModel.getComputer().getSelectedPokemon().getMaxHealth())*100));
		//Enemy Status bar
		if (myModel.getComputer().getSelectedPokemon().getStatus() instanceof Burn){
			EnemyStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/FireIC_Big.png")));
			EnemyStatusIcon.setVisible(true);
		}else if (myModel.getComputer().getSelectedPokemon().getStatus() instanceof Poison){
			EnemyStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/PoisonIC_Big.png")));
			EnemyStatusIcon.setVisible(true);			
		}else if (myModel.getComputer().getSelectedPokemon().getStatus() instanceof Frozen){
			EnemyStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/IceIC_Big.png")));
			EnemyStatusIcon.setVisible(true);
		}else{
			EnemyStatusIcon.setVisible(false);
		}
		
		/**
		 * Net beans generated layout code.
		 */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerStatusIcon)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(playerHPBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerPokemonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 638, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnemyStatusIcon)
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
                            .addComponent(enemyNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnemyHPBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyPokemonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enemyNameLabel)
                            .addComponent(PlayerStatusIcon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerHPBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EnemyStatusIcon)))
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

	/**
	 * Depending on this button was pressed, determine which attack to use.
	 * @param evt
	 * @param jb
	 */
    private void jButtonActionPerformed(java.awt.event.ActionEvent evt, JButton jb) {    
    	myModel.detach(this);
        if (jb == jButton1){
        	myController = new AttackController(myModel, myModel.getPlayer().getSelectedPokemon().getMoves().get(0));
        	myController.execute();
        }
        if (jb == jButton2){
        	myController = new AttackController(myModel, myModel.getPlayer().getSelectedPokemon().getMoves().get(1));
        	myController.execute();
        }
        if (jb == jButton3){
        	myController = new AttackController(myModel, myModel.getPlayer().getSelectedPokemon().getMoves().get(2));
        	myController.execute();
        }
        if (jb == jButton4){
        	myController = new AttackController(myModel, myModel.getPlayer().getSelectedPokemon().getMoves().get(3));
        	myController.execute();
        }        
    }                                 


    // Variables declaration - do not modify                     
    private javax.swing.JProgressBar EnemyHPBar;
    private javax.swing.JLabel EnemyStatusIcon;
    private javax.swing.JLabel PlayerStatusIcon;
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
	@Override
	public void update() {
		System.out.println("Select Attack View Updated");
		this.removeAll();
		initComponents();		
	}
}
