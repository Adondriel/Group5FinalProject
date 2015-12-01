package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import controller.AttackController;
import model.Model;

public class SelectAttackView extends View {
	public SelectAttackView(Model m){
		myModel = m;
		myController = new AttackController(m);
		initComponents();
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
        String atkStr1 = myModel.getPlayer().getSelectedPokemon().getMoves().get(0).getClass().getName().replace("attacks.FireAttackAbilities.", "");
        atkStr1 = myModel.getPlayer().getSelectedPokemon().getMoves().get(0).getClass().getName().replace("attacks.GrassAttackAbilities.", "");
        atkStr1 = myModel.getPlayer().getSelectedPokemon().getMoves().get(0).getClass().getName().replace("attacks.WaterAttackAbilities.", "");

        String atkStr2 = myModel.getPlayer().getSelectedPokemon().getMoves().get(1).getClass().getName().replace("attacks.FireAttackAbilities.", "");
        atkStr2 = myModel.getPlayer().getSelectedPokemon().getMoves().get(1).getClass().getName().replace("attacks.GrassAttackAbilities.", "");
        atkStr2 = myModel.getPlayer().getSelectedPokemon().getMoves().get(1).getClass().getName().replace("attacks.WaterAttackAbilities.", "");
        
        String atkStr3 = myModel.getPlayer().getSelectedPokemon().getMoves().get(2).getClass().getName().replace("attacks.FireAttackAbilities.", "");
        atkStr3 = myModel.getPlayer().getSelectedPokemon().getMoves().get(2).getClass().getName().replace("attacks.GrassAttackAbilities.", "");
        atkStr3 = myModel.getPlayer().getSelectedPokemon().getMoves().get(2).getClass().getName().replace("attacks.WaterAttackAbilities.", "");
       
        String atkStr4 = myModel.getPlayer().getSelectedPokemon().getMoves().get(3).getClass().getName().replace("attacks.FireAttackAbilities.", "");
        atkStr4 = myModel.getPlayer().getSelectedPokemon().getMoves().get(3).getClass().getName().replace("attacks.GrassAttackAbilities.", "");
        atkStr4 = myModel.getPlayer().getSelectedPokemon().getMoves().get(3).getClass().getName().replace("attacks.WaterAttackAbilities.", "");

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
        //System.out.println(str);
        ImageIcon img = new ImageIcon(getClass().getResource(str));
        playerPokemonIcon.setIcon(img);
        playerPokemonIcon.setText("Pokemon");
        playerPokemonIcon.setPreferredSize(new java.awt.Dimension(200, 200));

        playerNameLabel.setText(myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8));
        int hp = myModel.getPlayer().getSelectedPokemon().getCurrentHealth();
        int max = myModel.getPlayer().getSelectedPokemon().getMaxHealth();
        int hpPercent = (hp/max)*100;
        System.out.println(hpPercent);

        playerHPBar.setValue(hpPercent);

        enemyNameLabel.setText(myModel.getPlayer().getSelectedPokemon().getClass().getName().substring(8));

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


    private void jButtonActionPerformed(java.awt.event.ActionEvent evt, JButton jb) {                                         
        if (jb == jButton1){
        	myController = new AttackController(myModel.getPlayer().getSelectedPokemon().getMoves().get(0))
        }
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
