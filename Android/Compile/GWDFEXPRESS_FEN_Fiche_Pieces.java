/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Fiche_Pieces
 * Date : 07/06/2016 15:47:14
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Fiche_Pieces extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Fiche_Pieces
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Designation
 */
class GWDSAI_Designation extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Fiche_Pieces.SAI_Designation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,105,68);
super.setRectCompPrincipal(105,2,197,68);
super.setQuid(2834674511545504864l);

super.setChecksum("970776931");

super.setNom("SAI_Designation");

super.setType(20001);

super.setLibelle("Désignation");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(32, 2);

super.setTailleInitiale(72, 302);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0x0, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Designation mWD_SAI_Designation;

/**
 * SAI_N_de_serie
 */
class GWDSAI_N_de_serie extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Fiche_Pieces.SAI_N_de_serie
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,105,68);
super.setRectCompPrincipal(105,2,197,68);
super.setQuid(2834674511545570400l);

super.setChecksum("970842467");

super.setNom("SAI_N_de_serie");

super.setType(20001);

super.setLibelle("N° de série");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(107, 2);

super.setTailleInitiale(72, 302);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0x0, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_N_de_serie mWD_SAI_N_de_serie;

/**
 * SAI_Quantite
 */
class GWDSAI_Quantite extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Fiche_Pieces.SAI_Quantite
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,86,68);
super.setRectCompPrincipal(86,2,216,68);
super.setQuid(2834674511545635936l);

super.setChecksum("970954464");

super.setNom("SAI_Quantite");

super.setType(20004);

super.setLibelle("Quantité:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(181, 2);

super.setTailleInitiale(72, 302);

super.setValeurInitiale("0");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0x0, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Quantite mWD_SAI_Quantite;

/**
 * SAI_Prox_unitaire_ht
 */
class GWDSAI_Prox_unitaire_ht extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Fiche_Pieces.SAI_Prox_unitaire_ht
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,86,68);
super.setRectCompPrincipal(86,2,216,68);
super.setQuid(2834674511545701472l);

super.setChecksum("971020000");

super.setNom("SAI_Prox_unitaire_ht");

super.setType(20004);

super.setLibelle("Prix HT:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(256, 2);

super.setTailleInitiale(72, 302);

super.setValeurInitiale("0");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0x0, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Prox_unitaire_ht mWD_SAI_Prox_unitaire_ht;

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Fiche_Pieces.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834674511545767008l);

super.setChecksum("971039987");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(360, 2);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(12, 500, 1000, 0, 1000);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreSurvol(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreEnfonce(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ch= new WDChaineA();



// ch est une chaine 


// ch=SAI_Designation+TAB+SAI_N_de_serie+TAB+SAI_Prox_unitaire_ht+TAB+SAI_Quantite
vWD_ch.setValeur(mWD_SAI_Designation.opPlus("\t").opPlus(mWD_SAI_N_de_serie).opPlus("\t").opPlus(mWD_SAI_Prox_unitaire_ht).opPlus("\t").opPlus(mWD_SAI_Quantite));

// Ferme(Express_FEN_Fiche_Pieces,ch)
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Fiche_Pieces,vWD_ch);

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SansNom1 mWD_BTN_SansNom1;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Fiche_Pieces.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834674511545832544l);

super.setChecksum("971105523");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setLibelle("Annuler");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(360, 158);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(12, 500, 1000, 500, 1000);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreSurvol(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreEnfonce(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Ferme()
WDAPIFenetre.ferme();

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SansNom2 mWD_BTN_SansNom2;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_Fiche_Pieces.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834674511545898080l);

super.setChecksum("971170603");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(30, 200);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Fiche_Pieces.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Fiche_Pieces.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFF000001, 0xFF000001, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de EXPRESS_FEN_Fiche_Pieces
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_Fiche_Pieces
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Designation = new GWDSAI_Designation();
mWD_SAI_N_de_serie = new GWDSAI_N_de_serie();
mWD_SAI_Quantite = new GWDSAI_Quantite();
mWD_SAI_Prox_unitaire_ht = new GWDSAI_Prox_unitaire_ht();
mWD_BTN_SansNom1 = new GWDBTN_SansNom1();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Fiche_Pieces
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834674511545439328l);

super.setChecksum("975630492");

super.setNom("EXPRESS_FEN_Fiche_Pieces");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(460, 320);

super.setTitre("Fiche_Pieces");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Fiche_Pieces
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Designation.initialiserObjet();
super.ajouter("SAI_Designation", mWD_SAI_Designation);
mWD_SAI_N_de_serie.initialiserObjet();
super.ajouter("SAI_N_de_serie", mWD_SAI_N_de_serie);
mWD_SAI_Quantite.initialiserObjet();
super.ajouter("SAI_Quantite", mWD_SAI_Quantite);
mWD_SAI_Prox_unitaire_ht.initialiserObjet();
super.ajouter("SAI_Prox_unitaire_ht", mWD_SAI_Prox_unitaire_ht);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouter("BTN_SansNom1", mWD_BTN_SansNom1);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Fiche_Pieces;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "170 ActivAndroid 4-HoloLight";
}
}
