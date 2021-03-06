package view;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import gameState.PlayerTurn;
import model.Observer;
import statusEffects.Burn;
import statusEffects.Frozen;
import statusEffects.Poison;
/**
 * The main view, this is where every other view will return to.
 * The buttons only change the View, they do not call any controllers.
 * @author Adam Pine
 *
 */
public class BattleView extends View implements Observer {
	/**
	 * Battleview will reset the controller, create the view, then attach itself to the model.
	 */
	public BattleView(){
		myController = null;
		initComponents();
		myModel.attach(this);
	}

	@Override
	/**
	 * This will cause the entire window to be redrawn anytime the update method gets called.
	 */
	public void update() {
		System.out.println("BattleView Updated");
		this.removeAll();
		initComponents();
	}
	/**
	 * The method that creates all the components.
	 */
	private void initComponents(){
		if (myModel.getPlayer().getPokedex().size()==0){
			System.out.println("Computer has defeated the player! Computer wins!");
			System.exit(0);
		}
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
        //Check if it is the player's turn. if not, disable the buttons.
        if (!(myModel.getState().getCurrentTurn() instanceof PlayerTurn)){
        	jButton1.setEnabled(false);
        	jButton2.setEnabled(false);
        	jButton3.setEnabled(false);
        	jButton4.setEnabled(false);
        }else{
        	jButton1.setEnabled(true);
        	jButton2.setEnabled(true);
        	jButton3.setEnabled(true);
        	jButton4.setEnabled(true);
        }
        
		setMinimumSize(new java.awt.Dimension(1080, 680));
		setPreferredSize(new java.awt.Dimension(1080, 680));
		//setup the buttons
		jButton1.setText("Attack");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SwapToAttackView(evt);
			}
		});

		jButton2.setText("Items");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SwapToItemView(evt);
			}
		});

		jButton3.setText("Equip");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SwapToEquipView(evt);
			}
		});

		jButton4.setText("Swap");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SwaptoSwapView(evt);
			}
		});

		/**
		 * Player Section. Assembles player info.
		 */
		//Determines the icon that needs to be used.
		String str = "resources/" + myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8)+ "200.png";		
		ImageIcon img = new ImageIcon(getClass().getResource(str));
		playerPokemonIcon.setIcon(img);
		playerPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));
		playerNameLabel.setText(myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8));
		//player HP bar section
		double hp = myModel.getPlayer().getSelectedPokemon().getCurrentHealth();
		double max = myModel.getPlayer().getSelectedPokemon().getMaxHealth();
		System.out.println("player hp:" + hp+"/"+max);
		double hpPercent = (hp / max) * 100;
		System.out.println(hpPercent+"%");
		playerHPBar.setValue((int)hpPercent);
		
		
		/* Test line to make sure the status icon code works.		
		 * try {
			Environment.getEnvironment().getPlayer().getSelectedPokemon().setStatus(new Poison(Environment.getEnvironment().getPlayer().getSelectedPokemon()));
		} catch (StatusEffectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/**
		 * Player Status icon section.
		 */
		if (myModel.getPlayer().getSelectedPokemon().getStatus() instanceof Burn){
			PlayerStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/FireIC_Big.png")));
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
		 * Netbeans generated layout code.
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
	protected void SwapToEquipView(ActionEvent evt) {
		myModel.detach(this);
		Display.globalDisplay.changeView(new EquipItemView());
	}

	//change view
	protected void SwaptoSwapView(ActionEvent evt) {
		myModel.detach(this);
		Display.globalDisplay.changeView(new SwapPokemonView());
	}
	//change view
	protected void SwapToItemView(ActionEvent evt) {
		myModel.detach(this);
		Display.globalDisplay.changeView(new SelectItemView());
	}
	//change view
	private void SwapToAttackView(java.awt.event.ActionEvent evt) {
		myModel.detach(this);
		Display.globalDisplay.changeView(new SelectAttackView());
	}

	// Variables declaration - do not modify
	private javax.swing.JProgressBar EnemyHPBar;
    private javax.swing.JLabel EnemyStatusIcon;
    private javax.swing.JLabel PlayerStatusIcon;
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
