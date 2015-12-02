package view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

import controller.Controller;
import controller.SelectThreePokemonController;
import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;
import model.Model;
import model.Observer;
import pokemon.Bulbasaur;
import pokemon.*;
import pokemon.Pokemon;
/**
 * 
 * @author Adam Pine
 *
 */
public class InitialView extends View implements Observer {
	private ArrayList<JToggleButton> selectedButtonList = new ArrayList<JToggleButton>(0);
	private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

	public InitialView() {
		myModel = new Model();
		initComponents();
	}

	@Override
	public void update() {
		//Update the info in the view. 
		//Init view does not need this.
	}

	private void initComponents() {

		jToggleButton1 = new JToggleButton();
		jToggleButton2 = new JToggleButton();
		jToggleButton3 = new JToggleButton();
		jToggleButton4 = new JToggleButton();
		jToggleButton5 = new JToggleButton();
		jToggleButton6 = new JToggleButton();
		jToggleButton7 = new JToggleButton();
		jToggleButton8 = new JToggleButton();
		jToggleButton10 = new JToggleButton();
		jToggleButton11 = new JToggleButton();
		jToggleButton12 = new JToggleButton();
		CompleteButton = new JButton();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jToggleButton13 = new JToggleButton();

		jToggleButton1.setText("Bulbasaur");
		jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton1);
			}
		});

		jToggleButton2.setText("Ivysaur");
		jToggleButton2.setToolTipText("");
		jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton2);
			}
		});

		jToggleButton3.setText("Venusaur");
		jToggleButton3.setPreferredSize(new java.awt.Dimension(89, 35));
		jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton3);
			}
		});

		jToggleButton4.setText("Caterpie");
		jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton4);
			}
		});

		jToggleButton5.setText("Charmander");
		jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton5);
			}
		});

		jToggleButton6.setText("Charmeleon");
		jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton6);
			}
		});

		jToggleButton7.setText("Charizard");
		jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton7);
			}
		});

		jToggleButton8.setText("Vulpix");
		jToggleButton8.setToolTipText("");
		jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton8);
			}
		});

		jToggleButton10.setText("Squirtle");
		jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton10);
			}
		});

		jToggleButton11.setText("Wartortle");
		jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton11);
			}
		});

		jToggleButton12.setText("Blastoise");
		jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton12);
			}
		});

		CompleteButton.setText("Complete");
		CompleteButton.setEnabled(false);
		CompleteButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CompleteButtonActionPerformed(evt);
			}
		});

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Grass Types");

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Fire Types");

		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Water Types");

		jToggleButton13.setText("Poliwag");
		jToggleButton13.setToolTipText("");
		jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButtonActionPerformed(evt, jToggleButton13);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jToggleButton12, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton11, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(jToggleButton10, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jToggleButton13, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(518, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE).addComponent(CompleteButton)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(jLabel3).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jToggleButton1).addComponent(jToggleButton5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jToggleButton2).addComponent(jToggleButton6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jToggleButton7)))
						.addGroup(layout.createSequentialGroup().addComponent(jToggleButton10)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jToggleButton11)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jToggleButton12)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jToggleButton4).addComponent(jToggleButton8).addComponent(jToggleButton13))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
				.addComponent(CompleteButton).addContainerGap()));
	}

	private void CompleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// call the controller function.
		for (int i = 0; i < 3; i++) {
			if (selectedButtonList.get(i) == jToggleButton1) {
				pokemonList.add(new Bulbasaur());
			}
			if (selectedButtonList.get(i) == jToggleButton2) {
				pokemonList.add(new Ivysaur());
			}
			if (selectedButtonList.get(i) == jToggleButton3) {
				pokemonList.add(new Venusaur());
			}
			if (selectedButtonList.get(i) == jToggleButton4) {
				pokemonList.add(new Caterpie());
			}
			if (selectedButtonList.get(i) == jToggleButton5) {
				pokemonList.add(new Charmander());
			}
			if (selectedButtonList.get(i) == jToggleButton6) {
				pokemonList.add(new Charmeleon());
			}
			if (selectedButtonList.get(i) == jToggleButton7) {
				pokemonList.add(new Charizard());
			}
			if (selectedButtonList.get(i) == jToggleButton8) {
				pokemonList.add(new Vulpix());
			}
			if (selectedButtonList.get(i) == jToggleButton10) {
				pokemonList.add(new Squirtle());
			}
			if (selectedButtonList.get(i) == jToggleButton11) {
				pokemonList.add(new Wartortle());
			}
			if (selectedButtonList.get(i) == jToggleButton12) {
				pokemonList.add(new Blastoise());
			}
			if (selectedButtonList.get(i) == jToggleButton13) {
				pokemonList.add(new Poliwag());
			}
		}
		myController = new SelectThreePokemonController(myModel, pokemonList);
		myController.execute();
	}

	private void jToggleButtonActionPerformed(ActionEvent evt, JToggleButton jtb) {
		if (jtb.isSelected()){
			if (selectedButtonList.size() >=3){
				jtb.setSelected(false);
			}else{
				selectedButtonList.add(jtb);
			}
		} else {
			selectedButtonList.remove(jtb);
		}
		if (selectedButtonList.size() >= 3){
			CompleteButton.setEnabled(true);
		}else{
			CompleteButton.setEnabled(false);
		}
	}
	
	private JButton CompleteButton;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JToggleButton jToggleButton1;
	private JToggleButton jToggleButton10;
	private JToggleButton jToggleButton11;
	private JToggleButton jToggleButton12;
	private JToggleButton jToggleButton13;
	private JToggleButton jToggleButton2;
	private JToggleButton jToggleButton3;
	private JToggleButton jToggleButton4;
	private JToggleButton jToggleButton5;
	private JToggleButton jToggleButton6;
	private JToggleButton jToggleButton7;
	private JToggleButton jToggleButton8;
	// End of variables declaration

}
