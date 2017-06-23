/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Notes
 * Date : 07/06/2016 15:50:12
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.xml.dino.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Notes extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Notes
////////////////////////////////////////////////////////////////////////////

/**
 * #EXPRESSVersion1
 */
class GWD_EXPRESSVersion1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.#EXPRESSVersion1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664674534295l);

super.setChecksum("935743668");

super.setNom("#EXPRESSVersion1");

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

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFF, 0xFFFFFF, creerPolice("Arial", -10.000000, 1), 3);

super.setCadreExterieur(1, 0xFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

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
public GWD_EXPRESSVersion1 mWD__EXPRESSVersion1;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Notes.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664674599831l);

super.setChecksum("935811484");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(1856, 34);

super.setTailleInitiale(295, 311);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);


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
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * SAI_Date2
 */
class GWDSAI_Date2 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Notes.SAI_Date2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,143,48);
super.setRectCompPrincipal(143,2,177,48);
super.setQuid(2834672664674665367l);

super.setChecksum("935967206");

super.setNom("SAI_Date2");

super.setType(20002);

super.setLibelle("Date");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(82, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseDatePickerDateMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

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

/**
 * Traitement: Initialisation de SAI_Date2
 */
public void init()
{
super.init();

// SAI_Date2=today()
this.setValeur(WDAPIDate.dateDuJour());

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Date2 mWD_SAI_Date2;

/**
 * SAI_Heure
 */
class GWDSAI_Heure extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Notes.SAI_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,143,48);
super.setRectCompPrincipal(143,2,177,48);
super.setQuid(2834672664674730903l);

super.setChecksum("936079203");

super.setNom("SAI_Heure");

super.setType(20003);

super.setLibelle("Heure");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(132, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMMSS");

super.setMasqueSaisie(new WDChaineU("UseDatePickerTimeMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

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

/**
 * Traitement: Initialisation de SAI_Heure
 */
public void init()
{
super.init();

// SAI_Heure=now()
this.setValeur(WDAPIDate.maintenant());

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Heure mWD_SAI_Heure;

/**
 * SAI_NomClient
 */
class GWDSAI_NomClient extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Notes.SAI_NomClient
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,142,48);
super.setRectCompPrincipal(142,2,178,48);
super.setQuid(2834672664674796439l);

super.setChecksum("936005356");

super.setNom("SAI_NomClient");

super.setType(20001);

super.setLibelle("Nom du client");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(232, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale(" ");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

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

super.setMiseABlancSiZero(true);

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
public GWDSAI_NomClient mWD_SAI_NomClient;

/**
 * SAI_Addresse
 */
class GWDSAI_Addresse extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Notes.SAI_Addresse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664674861975l);

super.setChecksum("936070892");

super.setNom("SAI_Addresse");

super.setType(20001);

super.setLibelle("Addresse:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(332, 4);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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

super.setMiseABlancSiZero(true);

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
public GWDSAI_Addresse mWD_SAI_Addresse;

/**
 * SAI_Ville2
 */
class GWDSAI_Ville2 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_Notes.SAI_Ville2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664674927511l);

super.setChecksum("936136428");

super.setNom("SAI_Ville2");

super.setType(20001);

super.setLibelle("Ville");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(382, 4);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(5);

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

super.setMiseABlancSiZero(true);

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
public GWDSAI_Ville2 mWD_SAI_Ville2;

/**
 * SAI_Telephone1
 */
class GWDSAI_Telephone1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_FEN_Notes.SAI_Telephone1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664674993047l);

super.setChecksum("936201964");

super.setNom("SAI_Telephone1");

super.setType(20001);

super.setLibelle("Téléphone");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(14);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(432, 4);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("21"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(6);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(false);

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
public GWDSAI_Telephone1 mWD_SAI_Telephone1;

/**
 * SAI_Problemes1
 */
class GWDSAI_Problemes1 extends WDChampSaisieMultiLigne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de EXPRESS_FEN_Notes.SAI_Problemes1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,324,23);
super.setRectCompPrincipal(0,23,324,135);
super.setQuid(2834672664675058583l);

super.setChecksum("936275358");

super.setNom("SAI_Problemes1");

super.setType(20001);

super.setLibelle("Détail de l'intervention: ");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(825, 4);

super.setTailleInitiale(160, 324);

super.setValeurInitiale(" ");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(7);

super.setModeAscenseur(2, 1);

super.setEffacementAutomatique(false);

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

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), 3);

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
public GWDSAI_Problemes1 mWD_SAI_Problemes1;

/**
 * SAI_Date1
 */
class GWDSAI_Date1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de EXPRESS_FEN_Notes.SAI_Date1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,164,48);
super.setRectCompPrincipal(164,2,125,48);
super.setQuid(2834672664675124119l);

super.setChecksum("936425958");

super.setNom("SAI_Date1");

super.setType(20002);

super.setLibelle("Date");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(675, 2);

super.setTailleInitiale(52, 289);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseDatePickerDateMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(8);

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
public GWDSAI_Date1 mWD_SAI_Date1;

/**
 * SAI_Heure_d_arrivée
 */
class GWDSAI_Heure_d_arrivee extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de EXPRESS_FEN_Notes.SAI_Heure_d_arrivée
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,161,48);
super.setRectCompPrincipal(161,2,129,48);
super.setQuid(2834672664675189655l);

super.setChecksum("936537955");

super.setNom("SAI_Heure_d_arrivée");

super.setType(20003);

super.setLibelle("Heure d'arrivée");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(725, 4);

super.setTailleInitiale(52, 290);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMMSS");

super.setMasqueSaisie(new WDChaineU("UseDatePickerTimeMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(9);

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
public GWDSAI_Heure_d_arrivee mWD_SAI_Heure_d_arrivee;

/**
 * SAI_Heure_départ
 */
class GWDSAI_Heure_depart extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de EXPRESS_FEN_Notes.SAI_Heure_départ
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,163,48);
super.setRectCompPrincipal(163,2,129,48);
super.setQuid(2834672664675255191l);

super.setChecksum("936603491");

super.setNom("SAI_Heure_départ");

super.setType(20003);

super.setLibelle("Heure départ");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(775, 2);

super.setTailleInitiale(52, 292);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMMSS");

super.setMasqueSaisie(new WDChaineU("UseDatePickerTimeMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(10);

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
public GWDSAI_Heure_depart mWD_SAI_Heure_depart;

/**
 * SAI_Problemes
 */
class GWDSAI_Problemes extends WDChampSaisieMultiLigne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de EXPRESS_FEN_Notes.SAI_Problemes
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,320,23);
super.setRectCompPrincipal(0,23,320,116);
super.setQuid(2834672664675320727l);

super.setChecksum("936537502");

super.setNom("SAI_Problemes");

super.setType(20001);

super.setLibelle("Problèmes:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(495, 2);

super.setTailleInitiale(141, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(11);

super.setModeAscenseur(2, 1);

super.setEffacementAutomatique(false);

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

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), 3);

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
public GWDSAI_Problemes mWD_SAI_Problemes;

/**
 * BTN_Ajouter
 */
class GWDBTN_Ajouter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de EXPRESS_FEN_Notes.BTN_Ajouter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664675386263l);

super.setChecksum("936596092");

super.setNom("BTN_Ajouter");

super.setType(4);

super.setLibelle("Ajouter");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1375, 6);

super.setTailleInitiale(73, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(12, 333, 1000, 0, 1000);

super.setNumTab(12);

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
 * Traitement: Clic sur BTN_Ajouter
 */
public void clicSurBoutonGauche()
// ch est une chaine
{
super.clicSurBoutonGauche();

// OuvreFille(Express_FEN_Fiche_Pieces)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Fiche_Pieces);

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
public GWDBTN_Ajouter mWD_BTN_Ajouter;

/**
 * BTN_Supprimer_Ligne
 */
class GWDBTN_Supprimer_Ligne extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de EXPRESS_FEN_Notes.BTN_Supprimer_Ligne
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664675451799l);

super.setChecksum("936661628");

super.setNom("BTN_Supprimer_Ligne");

super.setType(4);

super.setLibelle("Supprimer Ligne");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1375, 195);

super.setTailleInitiale(73, 159);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(12, 333, 1000, 333, 1000);

super.setNumTab(13);

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
 * Traitement: Clic sur BTN_Supprimer_Ligne
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ResSelect= new WDEntier();



// ResSelect est un entier


// ResSelect = TableSelect(TABLE_SansNom1)
vWD_ResSelect.setValeur(WDAPITable.tableSelect(mWD_TABLE_SansNom1));

// TableSupprime(TABLE_SansNom1, ResSelect)
WDAPITable.tableSupprime(mWD_TABLE_SansNom1,vWD_ResSelect.getInt());

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
public GWDBTN_Supprimer_Ligne mWD_BTN_Supprimer_Ligne;

/**
 * BTN_SansNom3
 */
class GWDBTN_SansNom3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de EXPRESS_FEN_Notes.BTN_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664675517335l);

super.setChecksum("936727164");

super.setNom("BTN_SansNom3");

super.setType(4);

super.setLibelle("Modifier Ligne");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1375, 389);

super.setTailleInitiale(73, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(12, 333, 1000, 666, 1000);

super.setNumTab(14);

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
 * Traitement: Clic sur BTN_SansNom3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ResSelect= new WDEntier();



// ResSelect est un entier


// ResSelect = TableSelect(TABLE_SansNom1)
vWD_ResSelect.setValeur(WDAPITable.tableSelect(mWD_TABLE_SansNom1));

// SI ResSelect<>-1 ALORS
if(vWD_ResSelect.opDiff(-1))
{
// 	gsLIGNE=ResSelect
vWD_gsLIGNE.setValeur(vWD_ResSelect);

// 	OuvreFille(ExPRESS_FEN_Edit_Piece,ExtraitChaîne(TABLE_SansNom1[ResSelect],1,TAB),ExtraitChaîne(TABLE_SansNom1[ResSelect],2,TAB),ExtraitChaîne(TABLE_SansNom1[ResSelect],3,TAB),ExtraitChaîne(TABLE_SansNom1[ResSelect],4,TAB))
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Edit_Piece,new WDObjet[] {WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_ResSelect),1,new WDChaineA("\t")),WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_ResSelect),2,new WDChaineA("\t")),WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_ResSelect),3,new WDChaineA("\t")),WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_ResSelect),4,new WDChaineA("\t"))} );

}

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
public GWDBTN_SansNom3 mWD_BTN_SansNom3;

/**
 * SAI_Service
 */
class GWDSAI_Service extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de EXPRESS_FEN_Notes.SAI_Service
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664675582871l);

super.setChecksum("936791788");

super.setNom("SAI_Service");

super.setType(20001);

super.setLibelle("Service");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(282, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(17);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(15);

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

super.setMiseABlancSiZero(true);

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
public GWDSAI_Service mWD_SAI_Service;

/**
 * INT_SansNom2
 */
class GWDINT_SansNom2 extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de EXPRESS_FEN_Notes.INT_SansNom2
////////////////////////////////////////////////////////////////////////////

/**
 * INT_SansNom2_Option_0
 */
class GWDINT_SansNom2_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.INT_SansNom2.INT_SansNom2_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Deplacement:");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom2_Option_0 mWD_INT_SansNom2_Option_0 = new GWDINT_SansNom2_Option_0();
/**
 * Initialise tous les champs de EXPRESS_FEN_Notes.INT_SansNom2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Notes.INT_SansNom2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_SansNom2_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,157,42);
super.setQuid(2834672664675648407l);

super.setChecksum("936858692");

super.setNom("INT_SansNom2");

super.setType(5);

super.setLibelle("Deplacement:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(975, 21);

super.setTailleInitiale(42, 157);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(18);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(16);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_CBox.png?E12_A6_Radio", 6);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de INT_SansNom2
 */
public void modification()
{
super.modification();

// SI INT_SansNom2[1] ALORS
if(this.get(1).getBoolean())
{
// 	SEL_Civilités..Visible=Vrai
mWD_SEL_Civilites.setVisible(true);

}
else
{
// 	SEL_Civilités..Visible=False
mWD_SEL_Civilites.setVisible(false);

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom2 mWD_INT_SansNom2;

/**
 * SEL_Civilités
 */
class GWDSEL_Civilites extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de EXPRESS_FEN_Notes.SEL_Civilités
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Civilités_Option_0
 */
class GWDSEL_Civilites_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.SEL_Civilités.SEL_Civilités_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Zone A- 0 à 19km");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Civilites_Option_0 mWD_SEL_Civilites_Option_0 = new GWDSEL_Civilites_Option_0();

/**
 * SEL_Civilités_Option_1
 */
class GWDSEL_Civilites_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Notes.SEL_Civilités.SEL_Civilités_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Zone B- 20 à 30km");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Civilites_Option_1 mWD_SEL_Civilites_Option_1 = new GWDSEL_Civilites_Option_1();

/**
 * SEL_Civilités_Option_2
 */
class GWDSEL_Civilites_Option_2 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Notes.SEL_Civilités.SEL_Civilités_Option_2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Zone C- 40 à 79km");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Civilites_Option_2 mWD_SEL_Civilites_Option_2 = new GWDSEL_Civilites_Option_2();

/**
 * SEL_Civilités_Option_3
 */
class GWDSEL_Civilites_Option_3 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Notes.SEL_Civilités.SEL_Civilités_Option_3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Zone D- 80 et plus");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Civilites_Option_3 mWD_SEL_Civilites_Option_3 = new GWDSEL_Civilites_Option_3();
/**
 * Initialise tous les champs de EXPRESS_FEN_Notes.SEL_Civilités
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Notes.SEL_Civilités
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Civilites_Option_0);
super.ajouterOption(mWD_SEL_Civilites_Option_1);
super.ajouterOption(mWD_SEL_Civilites_Option_2);
super.ajouterOption(mWD_SEL_Civilites_Option_3);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,272,153);
super.setQuid(2834672664675779479l);

super.setChecksum("936990220");

super.setNom("SEL_Civilités");

super.setType(6);

super.setLibelle("Civilités Abrégées");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1019, 21);

super.setTailleInitiale(153, 272);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(19);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(17);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Radio.png?E12_A6_Radio", 6);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Civilites mWD_SEL_Civilites;

/**
 * INT_SansNom1
 */
class GWDINT_SansNom1 extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°20 de EXPRESS_FEN_Notes.INT_SansNom1
////////////////////////////////////////////////////////////////////////////

/**
 * INT_SansNom1_Option_0
 */
class GWDINT_SansNom1_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.INT_SansNom1.INT_SansNom1_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Informatique");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom1_Option_0 mWD_INT_SansNom1_Option_0 = new GWDINT_SansNom1_Option_0();

/**
 * INT_SansNom1_Option_1
 */
class GWDINT_SansNom1_Option_1 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Notes.INT_SansNom1.INT_SansNom1_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Imprimante");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom1_Option_1 mWD_INT_SansNom1_Option_1 = new GWDINT_SansNom1_Option_1();

/**
 * INT_SansNom1_Option_2
 */
class GWDINT_SansNom1_Option_2 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Notes.INT_SansNom1.INT_SansNom1_Option_2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Copieur/fax");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom1_Option_2 mWD_INT_SansNom1_Option_2 = new GWDINT_SansNom1_Option_2();
/**
 * Initialise tous les champs de EXPRESS_FEN_Notes.INT_SansNom1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Notes.INT_SansNom1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_SansNom1_Option_0);
super.ajouterOption(mWD_INT_SansNom1_Option_1);
super.ajouterOption(mWD_INT_SansNom1_Option_2);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,206,166);
super.setQuid(2834672664676107159l);

super.setChecksum("937317444");

super.setNom("INT_SansNom1");

super.setType(5);

super.setLibelle("&Interrupteur");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1174, 21);

super.setTailleInitiale(166, 206);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(20);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(18);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_CBox.png?E12_A6_Radio", 6);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de INT_SansNom1
 */
public void init()
{
super.init();

// INT_SansNom1[1]=false
this.get(1).setValeur(false);

// INT_SansNom1[2]=false
this.get(2).setValeur(false);

// INT_SansNom1[3]=false
this.get(3).setValeur(false);

// SAI_Copieur..Visible=False
mWD_SAI_Copieur.setVisible(false);

// SAI_HeureImprimante..Visible=False
mWD_SAI_HeureImprimante.setVisible(false);

// SAI_HeureInfo..Visible=False
mWD_SAI_HeureInfo.setVisible(false);

}



/**
 * Traitement: A chaque modification de INT_SansNom1
 */
public void modification()
{
super.modification();

// SI INT_SansNom1[1] ALORS
if(this.get(1).getBoolean())
{
// 	SAI_HeureInfo..Visible=True	
mWD_SAI_HeureInfo.setVisible(true);

}
else
{
// 	SAI_HeureInfo..Visible=False
mWD_SAI_HeureInfo.setVisible(false);

}

// SI INT_SansNom1[2] ALORS
if(this.get(2).getBoolean())
{
// 	SAI_HeureImprimante..Visible=True
mWD_SAI_HeureImprimante.setVisible(true);

}
else
{
// 	SAI_HeureImprimante..Visible=False
mWD_SAI_HeureImprimante.setVisible(false);

}

// SI INT_SansNom1[3] ALORS
if(this.get(3).getBoolean())
{
// 	SAI_Copieur..Visible=True
mWD_SAI_Copieur.setVisible(true);

}
else
{
// 	SAI_Copieur..Visible=False
mWD_SAI_Copieur.setVisible(false);

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_SansNom1 mWD_INT_SansNom1;

/**
 * SAI_HeureImprimante
 */
class GWDSAI_HeureImprimante extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°21 de EXPRESS_FEN_Notes.SAI_HeureImprimante
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,85,39);
super.setRectCompPrincipal(85,2,149,39);
super.setQuid(2834672664676369303l);

super.setChecksum("937624681");

super.setNom("SAI_HeureImprimante");

super.setType(20004);

super.setLibelle("Heures:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1262, 32);

super.setTailleInitiale(43, 234);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(21);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(19);

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
public GWDSAI_HeureImprimante mWD_SAI_HeureImprimante;

/**
 * SAI_Copieur
 */
class GWDSAI_Copieur extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°22 de EXPRESS_FEN_Notes.SAI_Copieur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,85,41);
super.setRectCompPrincipal(85,2,139,41);
super.setQuid(2834672664676434839l);

super.setChecksum("937690217");

super.setNom("SAI_Copieur");

super.setType(20004);

super.setLibelle("Heures:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1332, 32);

super.setTailleInitiale(45, 224);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(22);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(20);

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
public GWDSAI_Copieur mWD_SAI_Copieur;

/**
 * SAI_HeureInfo
 */
class GWDSAI_HeureInfo extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°23 de EXPRESS_FEN_Notes.SAI_HeureInfo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,85,43);
super.setRectCompPrincipal(85,2,149,43);
super.setQuid(2834672664676500375l);

super.setChecksum("937755753");

super.setNom("SAI_HeureInfo");

super.setType(20004);

super.setLibelle("Heures:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1200, 32);

super.setTailleInitiale(47, 234);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9 999 999 999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(23);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(21);

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
public GWDSAI_HeureInfo mWD_SAI_HeureInfo;

/**
 * TABLE_SansNom1
 */
class GWDTABLE_SansNom1 extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°24 de EXPRESS_FEN_Notes.TABLE_SansNom1
////////////////////////////////////////////////////////////////////////////

/**
 * COL_Désignation
 */
class GWDCOL_Designation extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.TABLE_SansNom1.COL_Désignation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676631447l);

super.setNom("COL_Désignation");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("");

super.setEtatInitial(0);

super.setLargeurInitiale(124);

super.setTitre("Désignation");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setPoliceColonne(creerPolice("Droid Sans", -9.000000, 0));

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Designation mWD_COL_Designation = new GWDCOL_Designation();

/**
 * COL_N_de_serie
 */
class GWDCOL_N_de_serie extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Notes.TABLE_SansNom1.COL_N_de_serie
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676696983l);

super.setNom("COL_N_de_serie");

super.setType(20001);

super.setMenuContextuelSysteme();

super.setNote("");

super.setEtatInitial(0);

super.setLargeurInitiale(147);

super.setTitre("N° de série");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setPoliceColonne(creerPolice("Droid Sans", -9.000000, 0));

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_N_de_serie mWD_COL_N_de_serie = new GWDCOL_N_de_serie();

/**
 * COL_Quantité
 */
class GWDCOL_Quantite extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Notes.TABLE_SansNom1.COL_Quantité
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676762519l);

super.setNom("COL_Quantité");

super.setType(20004);

super.setMenuContextuelSysteme();

super.setNote("");

super.setEtatInitial(0);

super.setLargeurInitiale(117);

super.setTitre("Quantité");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setPoliceColonne(creerPolice("Droid Sans", -9.000000, 0));

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Quantite mWD_COL_Quantite = new GWDCOL_Quantite();

/**
 * COL_Prix_HT
 */
class GWDCOL_Prix_HT extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Notes.TABLE_SansNom1.COL_Prix_HT
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676828055l);

super.setNom("COL_Prix_HT");

super.setType(20005);

super.setMenuContextuelSysteme();

super.setNote("");

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("Prix HT");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setPoliceColonne(creerPolice("Droid Sans", -9.000000, 0));

super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(4);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask$"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Prix_HT mWD_COL_Prix_HT = new GWDCOL_Prix_HT();
/**
 * Initialise tous les champs de EXPRESS_FEN_Notes.TABLE_SansNom1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Notes.TABLE_SansNom1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("COL_Désignation",mWD_COL_Designation);
super.ajouterColonne("COL_N_de_serie",mWD_COL_N_de_serie);
super.ajouterColonne("COL_Quantité",mWD_COL_Quantite);
super.ajouterColonne("COL_Prix_HT",mWD_COL_Prix_HT);
mWD_COL_Designation.initialiserObjet();
mWD_COL_N_de_serie.initialiserObjet();
mWD_COL_Quantite.initialiserObjet();
mWD_COL_Prix_HT.initialiserObjet();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676565911l);

super.setChecksum("937778020");

super.setNom("TABLE_SansNom1");

super.setType(9);

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(1450, 2);

super.setTailleInitiale(370, 559);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(24);

super.setHauteurLigne(40);

super.setAncrageInitial(8, 1000, 1000, 1000, 0);

super.setNumTab(22);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(1);

super.setEnregistrementSortieLigne(true);

super.setPersistant(true);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleSeparateurVerticaux(true, 0xDDDDDD);

super.setStyleSeparateurHorizontaux(0, 0xDDDDDD);

super.setCadreInterne(2, 0xDDDDDD, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x0, 0xDDDDDD, 0x0, 0xFFFFFF);

super.setStyleSelectionMode9Images(0x0, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Select.png?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 5, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleEnteteColonne(24, 1, WDCadreFactory.creerCadre9Images_GEN("##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Table_ColTitle.png?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 0xE6E6E6, 1, 5), creerPolice("Droid Sans", -9.000000, 0), 0x0, true, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Table_ColPict.png");

super.setScrollRapideTable(false, null);

super.setBtnEnrouleDeroule(true);

super.setSwipe(0);

super.setNbMaxLignes(0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}
protected final int getIdEnteteAt(int nColonne, int nLigne) {return 0;}
protected final String getLibelleEnteteFromId(int nId) {return null;}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTABLE_SansNom1 mWD_TABLE_SansNom1;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°25 de EXPRESS_FEN_Notes.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664676893591l);

super.setChecksum("938103420");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-123, 91);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(25);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(23);

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

// OuvreFille(Express_FEN_SansNom2)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2);

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
 * SAI_titre
 */
class GWDSAI_titre extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°26 de EXPRESS_FEN_Notes.SAI_titre
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664676959127l);

super.setChecksum("938168044");

super.setNom("SAI_titre");

super.setType(20001);

super.setLibelle("Nom fichier");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(34, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(26);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(24);

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

super.setMiseABlancSiZero(true);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0x0, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SAI_titre
 */
public void modification()
{
super.modification();

// gschaine=SAI_titre
vWD_gsChaine.setValeur(this);

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_titre mWD_SAI_titre;

/**
 * BTN_Créer1
 */
class GWDBTN_Creer1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°27 de EXPRESS_FEN_Notes.BTN_Créer1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664677024663l);

super.setChecksum("938234492");

super.setNom("BTN_Créer1");

super.setType(4);

super.setLibelle("Signature");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1812, 2);

super.setTailleInitiale(42, 547);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(27);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(25);

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
 * Traitement: Clic sur BTN_Créer1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// ouvrefenetremobile(Express_FEN_Edition,0,gsChaine)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Edition,new WDObjet[] {new WDEntier(0),vWD_gsChaine} );

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
public GWDBTN_Creer1 mWD_BTN_Creer1;

/**
 * SAI_Technicien
 */
class GWDSAI_Technicien extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°28 de EXPRESS_FEN_Notes.SAI_Technicien
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,144,48);
super.setRectCompPrincipal(144,2,176,48);
super.setQuid(2834672664677090199l);

super.setChecksum("938299116");

super.setNom("SAI_Technicien");

super.setType(20001);

super.setLibelle("Technicien");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(182, 2);

super.setTailleInitiale(52, 320);

super.setValeurInitiale(" ");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("1"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(28);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(26);

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
public GWDSAI_Technicien mWD_SAI_Technicien;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°29 de EXPRESS_FEN_Notes.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664677155735l);

super.setChecksum("938367388");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(1921, -293);

super.setTailleInitiale(191, 252);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\blanck.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(29);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);


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
public GWDIMG_SansNom2 mWD_IMG_SansNom2;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°30 de EXPRESS_FEN_Notes.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664677221271l);

super.setChecksum("938430644");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(2, 2);

super.setTailleInitiale(30, 200);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(30);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Notes.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de EXPRESS_FEN_Notes
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  Sauvegarde ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_sauvegarde()
{
initExecProcLocale("Sauvegarde");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_e= new WDEntier();

WDObjet vWD_ch= new WDChaineA();

WDObjet vWD_nIdFic= new WDEntier();

WDObjet vWD_sMaChaine= new WDChaineA();



// si fFichierExiste("/sdcard/pfsi-Fiches/"+gsChaine+".png") ALORS
if(WDAPIFichier.fFichierExiste(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".png").getString()).getBoolean())
{
}
else
{
// 	dSauveImagePNG(IMG_SansNom2,"/sdcard/pfsi-Fiches/"+gsChaine+".png")
WDAPIDessin.dSauveImagePNG(mWD_IMG_SansNom2,new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".png").getString());

}

// e est un entier=TABLE_SansNom1..Occurrence

vWD_e.setValeur(mWD_TABLE_SansNom1.getOccurrence());


// ch est une chaine =""

vWD_ch.setValeur("");


// ch=TAB+"<List>"+RC
vWD_ch.setValeur("\t<List>\r\n");

// FOR i=1 a e 
for(WDObjet vWD_i = new WDEntier(1);vWD_i.opInfEgal(vWD_e);vWD_i.opInc())
{
// 	ch+=TAB+TAB+"<iece>"+RC
vWD_ch.setValeur(vWD_ch.opPlus("\t\t<iece>\r\n"));

// 	ch+=TAB+TAB+TAB+"<Desi>"+Remplace(Remplace(Remplace(ExtraitChaîne(TABLE_SansNom1[i],1,TAB),"&","&amp;"),">","&gt;"),"<","&lt;") +"</Desi>"+RC
vWD_ch.setValeur(vWD_ch.opPlus(new WDChaineA("\t\t\t<Desi>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_i),1,new WDChaineA("\t")),new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Desi>").opPlus("\r\n")));

// 	ch+=TAB+TAB+TAB+"<NSerie>"+Remplace(Remplace(Remplace(ExtraitChaîne(TABLE_SansNom1[i],2,TAB),"&","&amp;"),">","&gt;"),"<","&lt;") +"</NSerie>"+RC 
vWD_ch.setValeur(vWD_ch.opPlus(new WDChaineA("\t\t\t<NSerie>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_i),2,new WDChaineA("\t")),new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</NSerie>").opPlus("\r\n")));

// 	ch+=TAB+TAB+TAB+"<Quantité>"+Remplace(Remplace(Remplace(ExtraitChaîne(TABLE_SansNom1[i],3,TAB),"&","&amp;"),">","&gt;"),"<","&lt;") +"</Quantité>"+RC 
vWD_ch.setValeur(vWD_ch.opPlus(new WDChaineA("\t\t\t<Quantité>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_i),3,new WDChaineA("\t")),new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Quantité>").opPlus("\r\n")));

// 	ch+=TAB+TAB+TAB+"<Prixht>"+Remplace(Remplace(Remplace(ExtraitChaîne(TABLE_SansNom1[i],4,TAB),"&","&amp;"),">","&gt;"),"<","&lt;") +"</Prixht>"+RC
vWD_ch.setValeur(vWD_ch.opPlus(new WDChaineA("\t\t\t<Prixht>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(mWD_TABLE_SansNom1.get(vWD_i),4,new WDChaineA("\t")),new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Prixht>").opPlus("\r\n")));

// 	ch+=TAB+TAB+"</iece>"+RC
vWD_ch.setValeur(vWD_ch.opPlus("\t\t</iece>\r\n"));

}

// ch+=TAB+"</List>"+RC
vWD_ch.setValeur(vWD_ch.opPlus("\t</List>\r\n"));

// nIdFic est un entier 


// sMaChaine est une chaîne


// nIdFic = fOuvre("/sdcard/pfsi-Fiches/"+gsChaine+".xml",foEcriture+foCréation)
vWD_nIdFic.setValeur(WDAPIFichier.fOuvre(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".xml").getString(),514));

// SI nIdFic=-1 ALORS
if(vWD_nIdFic.opEgal(-1))
{
// 	Erreur("lors de la sauvegarde")
WDAPIDialogue.erreur(new WDChaineA("lors de la sauvegarde").getString());

}
else
{
// 	sMaChaine="<?xml version="+Caract(34)+"1.0"+Caract(34)+" encoding="+Caract(34)+"UTF-8"+Caract(34)+"?>"+RC
vWD_sMaChaine.setValeur(new WDChaineA("<?xml version=").opPlus(WDAPIChaine.caract(34)).opPlus("1.0").opPlus(WDAPIChaine.caract(34)).opPlus(" encoding=").opPlus(WDAPIChaine.caract(34)).opPlus("UTF-8").opPlus(WDAPIChaine.caract(34)).opPlus("?>").opPlus("\r\n"));

// 	sMaChaine+="<Fiche>"+RC+TAB+"<Date>"+SAI_Date2+"</Date>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("<Fiche>\r\n\t<Date>").opPlus(mWD_SAI_Date2).opPlus("</Date>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"<Heure>"+ SAI_Heure+"</Heure>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<Heure>").opPlus(mWD_SAI_Heure).opPlus("</Heure>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"<Techni>"+ Remplace(Remplace(Remplace(SAI_Technicien,"&","*&amp;"),">","&gt;"),"<","&lt;")+"</Techni>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<Techni>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Technicien,new WDChaineA("&"),new WDChaineA("*&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Techni>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"<Probleme>"+ Remplace(Remplace(Remplace(SAI_Problemes,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Probleme>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<Probleme>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Problemes,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Probleme>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"<Client>"+RC//+ SAI_Problemes+"</Probleme>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<Client>\r\n"));

// 	sMaChaine+=	TAB+TAB+"<Nom>"+ Remplace(Remplace(Remplace(SAI_NomClient,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Nom>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Nom>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_NomClient,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Nom>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<Addresse>"+ Remplace(Remplace(Remplace(SAI_Addresse,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Addresse>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Addresse>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Addresse,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Addresse>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<Service>"+ Remplace(Remplace(Remplace(SAI_Service,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Service>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Service>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Service,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Service>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<Ville>"+ Remplace(Remplace(Remplace(SAI_Ville2,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Ville>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Ville>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Ville2,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Ville>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<Telephone>"+ SAI_Telephone1+"</Telephone>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Telephone>").opPlus(mWD_SAI_Telephone1).opPlus("</Telephone>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"</Client>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t</Client>\r\n"));

// 	sMaChaine+=	TAB+"<Intervention>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<Intervention>\r\n"));

// 	sMaChaine+=	TAB+TAB+"<Date>"+ SAI_Date1+"</Date>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Date>").opPlus(mWD_SAI_Date1).opPlus("</Date>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<HeureArrivé>"+ SAI_Heure_d_arrivée+"</HeureArrivé>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<HeureArrivé>").opPlus(mWD_SAI_Heure_d_arrivee).opPlus("</HeureArrivé>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<HeureDepart>"+ SAI_Heure_départ+"</HeureDepart>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<HeureDepart>").opPlus(mWD_SAI_Heure_depart).opPlus("</HeureDepart>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+TAB+"<Detail>"+ Remplace(Remplace(Remplace(SAI_Problemes1,"&","&amp;"),">","&gt;"),"<","&lt;")+"</Detail>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t\t<Detail>").opPlus(WDAPIChaine.remplace(WDAPIChaine.remplace(WDAPIChaine.remplace(mWD_SAI_Problemes1,new WDChaineA("&"),new WDChaineA("&amp;")),new WDChaineA(">"),new WDChaineA("&gt;")),new WDChaineA("<"),new WDChaineA("&lt;"))).opPlus("</Detail>").opPlus("\r\n")));

// 	sMaChaine+=	TAB+"</Intervention>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t</Intervention>\r\n"));

// 	sMaChaine+=Ch
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(vWD_ch));

// 	SI INT_SansNom2[1] ALORS
if(mWD_INT_SansNom2.get(1).getBoolean())
{
// 		sMaChaine+=	TAB+"<Deplacement>"+SEL_Civilités+"</Deplacement>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<Deplacement>").opPlus(mWD_SEL_Civilites).opPlus("</Deplacement>").opPlus("\r\n")));

}
else
{
// 		sMaChaine+=	TAB+"<Deplacement>-1</Deplacement>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<Deplacement>-1</Deplacement>\r\n"));

}

// 	SI INT_SansNom1[1] ALORS
if(mWD_INT_SansNom1.get(1).getBoolean())
{
// 		sMaChaine+=	TAB+"<MainInformatique>"+SAI_HeureInfo+"</MainInformatique>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<MainInformatique>").opPlus(mWD_SAI_HeureInfo).opPlus("</MainInformatique>").opPlus("\r\n")));

}
else
{
// 		sMaChaine+=TAB+"<MainInformatique>-1</MainInformatique>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<MainInformatique>-1</MainInformatique>\r\n"));

}

// 	SI INT_SansNom1[2] ALORS
if(mWD_INT_SansNom1.get(2).getBoolean())
{
// 		sMaChaine+=	TAB+"<MainImprimante>"+SAI_HeureImprimante+"</MainImprimante>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<MainImprimante>").opPlus(mWD_SAI_HeureImprimante).opPlus("</MainImprimante>").opPlus("\r\n")));

}
else
{
// 		sMaChaine+=	TAB+"<MainImprimante>-1</MainImprimante>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<MainImprimante>-1</MainImprimante>\r\n"));

}

// 	SI INT_SansNom1[3] ALORS
if(mWD_INT_SansNom1.get(3).getBoolean())
{
// 		sMaChaine+=	TAB+"<MainCopieur>"+SAI_Copieur+"</MainCopieur>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus(new WDChaineA("\t<MainCopieur>").opPlus(mWD_SAI_Copieur).opPlus("</MainCopieur>").opPlus("\r\n")));

}
else
{
// 		sMaChaine+=	TAB+"<MainCopieur>-1</MainCopieur>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("\t<MainCopieur>-1</MainCopieur>\r\n"));

}

// 	sMaChaine+="</Fiche>"+RC
vWD_sMaChaine.setValeur(vWD_sMaChaine.opPlus("</Fiche>\r\n"));

// 	replace(sMaChaine,EOT,"")
WDAPIChaine.remplace(vWD_sMaChaine,new WDChaineA(""),new WDChaineA(""));

// 	fSauveTexte("/sdcard/pfsi-Fiches/"+gsChaine+".xml", sMaChaine)
WDAPIFichier.fSauveTexte(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".xml").getString(),vWD_sMaChaine);

// 	fFerme(nIdFic)
WDAPIFichier.fFerme(vWD_nIdFic.getInt());

}

}
finally
{
finExecProcLocale();
}

}


//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// Ouvrir ( [<NomCheminFichier>])
// 
//  Paramètres :
// 	NomCheminFichier (valeur par défaut="/sdcard/pfsi-Fiches/test.xml") : < indiquez ici le rôle de braw >
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_ouvrir( WDObjet vWD_NomCheminFichier )
{
initExecProcLocale("Ouvrir");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_IDFichier= new WDEntier();

WDObjet vWD_LigneLue= new WDChaineA();

WDObjet vWD_MonBuffer = new WDBuffer();

WDObjet vWD_MaChaine= new WDChaineA();

WDObjet vWD_sDataXML = WDVarNonAllouee.ref;


// IDFichier est un entier


// LigneLue est une chaîne


// IDFichier = fOuvre(NomCheminFichier+".xml")
vWD_IDFichier.setValeur(WDAPIFichier.fOuvre(vWD_NomCheminFichier.opPlus(".xml").getString()));

// SI IDFichier = -1 ALORS
if(vWD_IDFichier.opEgal(-1))
{
// 	Erreur("hey"+ErreurInfo(errMessage))
WDAPIDialogue.erreur(new WDChaineA("hey").opPlus(WDAPIVM.erreurInfo(1)).getString());

}
else
{
// 	BOUCLE
while(true)
{
// 		LigneLue = fLitLigne(IDFichier)
vWD_LigneLue.setValeur(WDAPIFichier.fLitLigne(vWD_IDFichier.getInt()));

// 		SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 			Erreur(ErreurInfo())
WDAPIDialogue.erreur(WDAPIVM.erreurInfo().getString());

// 			SORTIR
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 		SI LigneLue = EOT ALORS SORTIR
if(vWD_LigneLue.opEgal(""))
{
// 		SI LigneLue = EOT ALORS SORTIR
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

}


// 	fFerme(IDFichier)
WDAPIFichier.fFerme(vWD_IDFichier.getInt());

}

// MonBuffer est un Buffer


// MonBuffer = fChargeTexte(NomCheminFichier+".xml")
vWD_MonBuffer.setValeur(WDAPIFichier.fChargeTexte(vWD_NomCheminFichier.opPlus(".xml").getString()));

// MaChaîne est une chaîne 


// MaChaîne=MonBuffer
vWD_MaChaine.setValeur(vWD_MonBuffer);

// si fFichierExiste(NomCheminFichier+".png") alors
if(WDAPIFichier.fFichierExiste(vWD_NomCheminFichier.opPlus(".png").getString()).getBoolean())
{
// 	IMG_SansNom1=NomCheminFichier+".png"
mWD_IMG_SansNom1.setValeur(vWD_NomCheminFichier.opPlus(".png"));

}
else
{
// 	dSauveImagePNG(IMG_SansNom1,NomCheminFichier+".png")	
WDAPIDessin.dSauveImagePNG(mWD_IMG_SansNom1,vWD_NomCheminFichier.opPlus(".png").getString());

// 	IMG_SansNom1=NomCheminFichier+".png"
mWD_IMG_SansNom1.setValeur(vWD_NomCheminFichier.opPlus(".png"));

}

// sDataXML est un xmlDocument 
vWD_sDataXML = new WDInstance( new WDXMLDocument() );


// sDataXML = XMLOuvre(MaChaîne,depuisChaîne)
vWD_sDataXML.setValeur(WDAPIXmlDINO.xmlOuvre(vWD_MaChaine,1));

// SI ErreurDétectée = Vrai ALORS
if(WDObjet.ErreurDetectee.opEgal(true))
{
// 	Erreur(ErreurInfo())
WDAPIDialogue.erreur(WDAPIVM.erreurInfo().getString());

}
else
{
// 	SAI_Date2=sDataXML.Fiche.Date
mWD_SAI_Date2.setValeur(vWD_sDataXML.get("Fiche").get("Date"));

// 	SAI_Heure=sDataXML.Fiche.Heure
mWD_SAI_Heure.setValeur(vWD_sDataXML.get("Fiche").get("Heure"));

// 	SAI_NomClient=sDataXML.Fiche.Client.Nom
mWD_SAI_NomClient.setValeur(vWD_sDataXML.get("Fiche").get("Client").get("Nom"));

// 	SAI_Service=sDataXML.Fiche.Client.Service
mWD_SAI_Service.setValeur(vWD_sDataXML.get("Fiche").get("Client").get("Service"));

// 	SAI_Addresse=sDataXML.Fiche.Client.Addresse
mWD_SAI_Addresse.setValeur(vWD_sDataXML.get("Fiche").get("Client").get("Addresse"));

// 	SAI_Ville2=sDataXML.Fiche.Client.Ville
mWD_SAI_Ville2.setValeur(vWD_sDataXML.get("Fiche").get("Client").get("Ville"));

// 	SAI_Telephone1=sDataXML.Fiche.Client.Telephone
mWD_SAI_Telephone1.setValeur(vWD_sDataXML.get("Fiche").get("Client").get("Telephone"));

// 	SAI_Problemes=sDataXML.Fiche.Probleme
mWD_SAI_Problemes.setValeur(vWD_sDataXML.get("Fiche").get("Probleme"));

// 	SAI_Date1=sDataXML.Fiche.Intervention.Date
mWD_SAI_Date1.setValeur(vWD_sDataXML.get("Fiche").get("Intervention").get("Date"));

// 	SAI_Heure_d_arrivée=sDataXML.Fiche.Intervention.HeureArrive
mWD_SAI_Heure_d_arrivee.setValeur(vWD_sDataXML.get("Fiche").get("Intervention").get("HeureArrive"));

// 	SAI_Heure_départ=sDataXML.Fiche.Intervention.HeureDepart
mWD_SAI_Heure_depart.setValeur(vWD_sDataXML.get("Fiche").get("Intervention").get("HeureDepart"));

// 	SAI_Problemes1=sDataXML.Fiche.Intervention.Detail
mWD_SAI_Problemes1.setValeur(vWD_sDataXML.get("Fiche").get("Intervention").get("Detail"));

// 	entieDepla est un entier = sDataXML.Fiche.Deplacement 
WDObjet vWD_entieDepla= new WDEntier();


vWD_entieDepla.setValeur(vWD_sDataXML.get("Fiche").get("Deplacement"));


// 	SI entieDepla=-1 ALORS 
if(vWD_entieDepla.opEgal(-1))
{
// 		INT_SansNom2[1]=False
mWD_INT_SansNom2.get(1).setValeur(false);

// 		SEL_Civilités..Visible=False 
mWD_SEL_Civilites.setVisible(false);

}
else
{
// 		INT_SansNom2[1]=True
mWD_INT_SansNom2.get(1).setValeur(true);

// 		SEL_Civilités..Visible=True
mWD_SEL_Civilites.setVisible(true);

// 		SELON(entieDepla)
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = vWD_entieDepla;
if(_WDExpSelon0.opEgal(1))
{
// 				SEL_Civilités=1
mWD_SEL_Civilites.setValeur(1);

}
else if(_WDExpSelon0.opEgal(2))
{
// 				SEL_Civilités=2
mWD_SEL_Civilites.setValeur(2);

}
else if(_WDExpSelon0.opEgal(3))
{
// 				SEL_Civilités=3
mWD_SEL_Civilites.setValeur(3);

}
else if(_WDExpSelon0.opEgal(4))
{
// 				SEL_Civilités=4
mWD_SEL_Civilites.setValeur(4);

}

}

}

// 	HeureInfo est un entier = sDataXML.Fiche.MainInformatique 
WDObjet vWD_HeureInfo= new WDEntier();


vWD_HeureInfo.setValeur(vWD_sDataXML.get("Fiche").get("MainInformatique"));


// 	SI HeureInfo=-1 ALORS 
if(vWD_HeureInfo.opEgal(-1))
{
// 		INT_SansNom1[1]=False 
mWD_INT_SansNom1.get(1).setValeur(false);

// 		SAI_HeureInfo..Visible=Faux
mWD_SAI_HeureInfo.setVisible(false);

}
else
{
// 		INT_SansNom1[1]=True 
mWD_INT_SansNom1.get(1).setValeur(true);

// 		SAI_HeureInfo..Visible=True
mWD_SAI_HeureInfo.setVisible(true);

// 		SAI_HeureInfo=HeureInfo
mWD_SAI_HeureInfo.setValeur(vWD_HeureInfo);

}

// 	HeureImpri est un entier = sDataXML.Fiche.MainImprimante 
WDObjet vWD_HeureImpri= new WDEntier();


vWD_HeureImpri.setValeur(vWD_sDataXML.get("Fiche").get("MainImprimante"));


// 	SI HeureImpri=-1 ALORS 
if(vWD_HeureImpri.opEgal(-1))
{
// 		INT_SansNom1[2]=False 
mWD_INT_SansNom1.get(2).setValeur(false);

// 		SAI_HeureImprimante..Visible=Faux
mWD_SAI_HeureImprimante.setVisible(false);

}
else
{
// 		INT_SansNom1[2]=True 
mWD_INT_SansNom1.get(2).setValeur(true);

// 		SAI_HeureImprimante..Visible=True
mWD_SAI_HeureImprimante.setVisible(true);

// 		SAI_HeureImprimante=HeureImpri
mWD_SAI_HeureImprimante.setValeur(vWD_HeureImpri);

}

// 	HeureCopieur est un entier = sDataXML.Fiche.MainCopieur 
WDObjet vWD_HeureCopieur= new WDEntier();


vWD_HeureCopieur.setValeur(vWD_sDataXML.get("Fiche").get("MainCopieur"));


// 	SI HeureCopieur=-1 ALORS 
if(vWD_HeureCopieur.opEgal(-1))
{
// 		INT_SansNom1[3]=False 
mWD_INT_SansNom1.get(3).setValeur(false);

// 		SAI_Copieur..Visible=Faux
mWD_SAI_Copieur.setVisible(false);

}
else
{
// 		INT_SansNom1[3]=True 
mWD_INT_SansNom1.get(3).setValeur(true);

// 		SAI_Copieur..Visible=True	
mWD_SAI_Copieur.setVisible(true);

// 		SAI_Copieur=HeureCopieur
mWD_SAI_Copieur.setValeur(vWD_HeureCopieur);

}

// 	POUR TOUTE iece DE sDataXML.Fiche.List
IWDParcours parcours1 = null;
try
{
WDObjet vWD_iece = WDParcoursFactory.creerVariableParcours(vWD_sDataXML.get("Fiche").get("List"));
parcours1 = WDParcoursFactory.pourTout(vWD_sDataXML.get("Fiche").get("List"), vWD_iece, null, null, null, 0x2);
while(parcours1.testParcours())
{
// 		TableInsèreLigne(TABLE_SansNom1,1,iece.Desi,iece.NSerie,iece.Quantité,iece.Prixht)
WDAPITable.tableInsereLigne(mWD_TABLE_SansNom1,1,new Object[] {parcours1.getVariableParcours().get("Desi"),parcours1.getVariableParcours().get("NSerie"),parcours1.getVariableParcours().get("Quantité"),parcours1.getVariableParcours().get("Prixht")} );

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// 	TableAffiche(TABLE_SansNom1)
WDAPITable.tableAffiche(mWD_TABLE_SansNom1);

}

}
finally
{
finExecProcLocale();
}

}
public void fWD_ouvrir()
{
fWD_ouvrir(new WDChaineA("/sdcard/pfsi-Fiches/test.xml"));
}


//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// Ouvrir1 ( [<NomCheminFichier>])
// 
//  Paramètres :
// 	NomCheminFichier (valeur par défaut="/sdcard/pfsi-Fiches/test.xml") : < indiquez ici le rôle de NomCheminFichier >
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_ouvrir1( WDObjet vWD_NomCheminFichier )
{
initExecProcLocale("Ouvrir1");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_MonBuffer = new WDBuffer();

WDObjet vWD_MaChaine= new WDChaineA();

WDObjet vWD_sDataXML = WDVarNonAllouee.ref;


// MonBuffer est un Buffer


// MonBuffer = fChargeTexte("sdcard/"+SAI_titre+".xml")
vWD_MonBuffer.setValeur(WDAPIFichier.fChargeTexte(new WDChaineA("sdcard/").opPlus(mWD_SAI_titre).opPlus(".xml").getString()));

// MaChaîne est une chaîne 


// MaChaîne=MonBuffer
vWD_MaChaine.setValeur(vWD_MonBuffer);

// replace(MaChaîne,"&lt;","<")
WDAPIChaine.remplace(vWD_MaChaine,new WDChaineA("&lt;"),new WDChaineA("<"));

// replace(MaChaîne,"&gt;",">")
WDAPIChaine.remplace(vWD_MaChaine,new WDChaineA("&gt;"),new WDChaineA(">"));

// replace(MaChaîne,"&amp;","&")
WDAPIChaine.remplace(vWD_MaChaine,new WDChaineA("&amp;"),new WDChaineA("&"));

// IMG_SansNom1=NomCheminFichier+".png"
mWD_IMG_SansNom1.setValeur(vWD_NomCheminFichier.opPlus(".png"));

// sDataXML est un xmlDocument 
vWD_sDataXML = new WDInstance( new WDXMLDocument() );


// sDataXML = XMLOuvre(Machaine,depuisChaîne)
vWD_sDataXML.setValeur(WDAPIXmlDINO.xmlOuvre(vWD_MaChaine,1));

// SI ErreurDétectée = Vrai ALORS
if(WDObjet.ErreurDetectee.opEgal(true))
{
// 	Erreur(ErreurInfo())
WDAPIDialogue.erreur(WDAPIVM.erreurInfo().getString());

}
else
{
// 	sChai est une chaine 
WDObjet vWD_sChai= new WDChaineA();



// 	Schai= ExtraitChaine(ExtraitChaîne(Machaine,2,"<Date>"),1,"</Date>")
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Date>")),1,new WDChaineA("</Date>")));

// 	si schai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		sChai=schai
vWD_sChai.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Heure>"),1,"</Heure>")//sDataXML.Fiche.Heure
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Heure>")),1,new WDChaineA("</Heure>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Heure=sChai
mWD_SAI_Heure.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Nom>"),1,"</Nom>")//sDataXML.Fiche.Client.Nom
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Nom>")),1,new WDChaineA("</Nom>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_NomClient=sChai
mWD_SAI_NomClient.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Service>"),1,"</Service>")// sDataXML.Fiche.Client.Service
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Service>")),1,new WDChaineA("</Service>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Service=sChai
mWD_SAI_Service.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Addresse>"),1,"</Addresse>")//sDataXML.Fiche.Client.Addresse
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Addresse>")),1,new WDChaineA("</Addresse>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Addresse=sChai
mWD_SAI_Addresse.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Ville>"),1,"</Ville>")//sDataXML.Fiche.Client.Ville
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Ville>")),1,new WDChaineA("</Ville>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Ville2=sChai
mWD_SAI_Ville2.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Telephone>"),1,"</Telephone>")//sDataXML.Fiche.Client.Telephone
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Telephone>")),1,new WDChaineA("</Telephone>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Telephone1=sChai
mWD_SAI_Telephone1.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Probleme>"),1,"</Probleme>")//sDataXML.Fiche.Probleme
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Probleme>")),1,new WDChaineA("</Probleme>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Problemes=sChai
mWD_SAI_Problemes.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,3,"<Date>"),1,"</Date>")//sDataXML.Fiche.Intervention.Date
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,3,new WDChaineA("<Date>")),1,new WDChaineA("</Date>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Date1=sChai
mWD_SAI_Date1.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Techni>"),1,"</Techni>")//sDataXML.Fiche.Intervention.Date
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Techni>")),1,new WDChaineA("</Techni>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Technicien=sChai
mWD_SAI_Technicien.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<HeureArrivé>"),1,"</HeureArrivé>")//sDataXML.Fiche.Intervention.HeureArrive
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<HeureArrivé>")),1,new WDChaineA("</HeureArrivé>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Heure_d_arrivée=sChai
mWD_SAI_Heure_d_arrivee.setValeur(vWD_sChai);

}

// 	sChai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<HeureDepart>"),1,"</HeureDepart>")//sDataXML.Fiche.Intervention.HeureDepart
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<HeureDepart>")),1,new WDChaineA("</HeureDepart>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Heure_départ=sChai
mWD_SAI_Heure_depart.setValeur(vWD_sChai);

}

// 	schai=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Detail>"),1,"</Detail>")//sDataXML.Fiche.Intervention.Detail
vWD_sChai.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Detail>")),1,new WDChaineA("</Detail>")));

// 	SI sChai <>EOT
if(vWD_sChai.opDiff(""))
{
// 		SAI_Problemes1=sChai
mWD_SAI_Problemes1.setValeur(vWD_sChai);

}

// 	entieDepla est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Deplacement>"),1,"</Deplacement>"))// sDataXML.Fiche.Deplacement 
WDObjet vWD_entieDepla= new WDEntier();


vWD_entieDepla.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Deplacement>")),1,new WDChaineA("</Deplacement>"))));


// 	SI entieDepla>0 ALORS 
if(vWD_entieDepla.opSup(0))
{
// 		INT_SansNom2[1]=True
mWD_INT_SansNom2.get(1).setValeur(true);

// 		SEL_Civilités..Visible=True
mWD_SEL_Civilites.setVisible(true);

// 		SELON(entieDepla)
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = vWD_entieDepla;
if(_WDExpSelon0.opEgal(1))
{
// 				SEL_Civilités=1
mWD_SEL_Civilites.setValeur(1);

}
else if(_WDExpSelon0.opEgal(2))
{
// 				SEL_Civilités=2
mWD_SEL_Civilites.setValeur(2);

}
else if(_WDExpSelon0.opEgal(3))
{
// 				SEL_Civilités=3
mWD_SEL_Civilites.setValeur(3);

}
else if(_WDExpSelon0.opEgal(4))
{
// 				SEL_Civilités=4
mWD_SEL_Civilites.setValeur(4);

}

}

}
else
{
// 		INT_SansNom2[1]=False
mWD_INT_SansNom2.get(1).setValeur(false);

// 		SEL_Civilités..Visible=False 		
mWD_SEL_Civilites.setVisible(false);

}

// 	HeureInfo est un entier = val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainInformatique>"),1,"</MainInformatique>"))//sDataXML.Fiche.MainInformatique 
WDObjet vWD_HeureInfo= new WDEntier();


vWD_HeureInfo.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainInformatique>")),1,new WDChaineA("</MainInformatique>"))));


// 	SI HeureInfo>0 ALORS 
if(vWD_HeureInfo.opSup(0))
{
// 		INT_SansNom1[1]=True 
mWD_INT_SansNom1.get(1).setValeur(true);

// 		SAI_HeureInfo..Visible=True
mWD_SAI_HeureInfo.setVisible(true);

// 		SAI_HeureInfo=HeureInfo
mWD_SAI_HeureInfo.setValeur(vWD_HeureInfo);

}
else
{
// 		INT_SansNom1[1]=False 
mWD_INT_SansNom1.get(1).setValeur(false);

// 		SAI_HeureInfo..Visible=Faux	
mWD_SAI_HeureInfo.setVisible(false);

}

// 	HeureImpri est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainImprimante>"),1,"</MainImprimante>"))// sDataXML.Fiche.MainImprimante 
WDObjet vWD_HeureImpri= new WDEntier();


vWD_HeureImpri.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainImprimante>")),1,new WDChaineA("</MainImprimante>"))));


// 	SI HeureImpri>0 ALORS 
if(vWD_HeureImpri.opSup(0))
{
// 		INT_SansNom1[2]=True 
mWD_INT_SansNom1.get(2).setValeur(true);

// 		SAI_HeureImprimante..Visible=True
mWD_SAI_HeureImprimante.setVisible(true);

// 		SAI_HeureImprimante=HeureImpri
mWD_SAI_HeureImprimante.setValeur(vWD_HeureImpri);

}
else
{
// 		INT_SansNom1[2]=False 
mWD_INT_SansNom1.get(2).setValeur(false);

// 		SAI_HeureImprimante..Visible=Faux
mWD_SAI_HeureImprimante.setVisible(false);

}

// 	HeureCopieur est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainCopieur>"),1,"</MainCopieur>")) //sDataXML.Fiche.MainCopieur 
WDObjet vWD_HeureCopieur= new WDEntier();


vWD_HeureCopieur.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainCopieur>")),1,new WDChaineA("</MainCopieur>"))));


// 	SI HeureCopieur>0 ALORS 
if(vWD_HeureCopieur.opSup(0))
{
// 		INT_SansNom1[3]=True 
mWD_INT_SansNom1.get(3).setValeur(true);

// 		SAI_Copieur..Visible=True	
mWD_SAI_Copieur.setVisible(true);

// 		SAI_Copieur=HeureCopieur	
mWD_SAI_Copieur.setValeur(vWD_HeureCopieur);

}
else
{
// 		INT_SansNom1[3]=False 
mWD_INT_SansNom1.get(3).setValeur(false);

// 		SAI_Copieur..Visible=Faux
mWD_SAI_Copieur.setVisible(false);

}

// 	TableSupprimeTout(TABLE_SansNom1)
WDAPITable.tableSupprimeTout(mWD_TABLE_SansNom1);

// 	nbOccurence est un entier=ChaîneOccurrence(MaChaîne,"<iece>")
WDObjet vWD_nbOccurence= new WDEntier();


vWD_nbOccurence.setValeur(WDAPIChaine.chaineOccurrence(vWD_MaChaine,new WDChaineA("<iece>")));


// 	POUR i=1 a nbOccurence
for(WDObjet vWD_i = new WDEntier(1);vWD_i.opInfEgal(vWD_nbOccurence);vWD_i.opInc())
{
// 		ch1 est une chaine=Remplace(ExtraitChaîne(MaChaîne,1+i,"<iece>"),"</iece>","")
WDObjet vWD_ch1= new WDChaineA();


vWD_ch1.setValeur(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(vWD_MaChaine,new WDEntier(1).opPlus(vWD_i).getInt(),new WDChaineA("<iece>")),new WDChaineA("</iece>"),new WDChaineA("")));


// 		TableInsèreLigne(TABLE_SansNom1,1,(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Desi>"),1,"</Desi>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<NSerie>"),1,"</NSerie>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Quantité>"),1,"</Quantité>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Prixht>"),1,"</Prixht>")))
WDAPITable.tableInsereLigne(mWD_TABLE_SansNom1,1,new Object[] {WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Desi>")),1,new WDChaineA("</Desi>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<NSerie>")),1,new WDChaineA("</NSerie>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Quantité>")),1,new WDChaineA("</Quantité>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Prixht>")),1,new WDChaineA("</Prixht>"))} );

}

// 	TableAffiche(TABLE_SansNom1)
WDAPITable.tableAffiche(mWD_TABLE_SansNom1);

}

}
finally
{
finExecProcLocale();
}

}
public void fWD_ouvrir1()
{
fWD_ouvrir1(new WDChaineA("/sdcard/pfsi-Fiches/test.xml"));
}


//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// OuvertureDropbox (<ch>)
// 
//  Paramètres :
// 	ch : <indiquez ici le rôle de ch>
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_ouvertureDropbox( WDObjet vWD_ch )
{
initExecProcLocale("OuvertureDropbox");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sBeforefront= new WDChaineA();

WDObjet vWD_xml= new WDChaineA();

WDObjet vWD_MaChaine= new WDChaineA();

WDObjet vWD_entieDepla= new WDEntier();

WDObjet vWD_HeureInfo= new WDEntier();

WDObjet vWD_HeureImpri= new WDEntier();

WDObjet vWD_HeureCopieur= new WDEntier();

WDObjet vWD_nbOccurence= new WDEntier();



// sBeforefront est  string


// sBeforefront=HTTPRequête("https://content.dropboxapi.com/1/files/auto/"+ch,"","Authorization: Bearer "+ gsKey,"","","","")
vWD_sBeforefront.setValeur(WDAPIHttp.HTTPRequete(new WDChaineA("https://content.dropboxapi.com/1/files/auto/").opPlus(vWD_ch).getString(),new WDChaineA("").getString(),new WDChaineA("Authorization: Bearer ").opPlus(vWD_gsKey),new WDChaineA(""),new WDChaineA("").getString(),new WDChaineA("").getString(),new WDChaineA("").getString()));

// HTTPGetResult(httpResult)
WDAPIHttp.HTTPDonneResultat(2);

// xml est chaine


// xml = HTTPGetResult(httpResult)
vWD_xml.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// sBeforefront=HTTPRequête("https://content.dropboxapi.com/1/files/auto/"+ExtraitChaîne(ch,1,".")+".png","","Authorization: Bearer "+ gsKey,"","","","")
vWD_sBeforefront.setValeur(WDAPIHttp.HTTPRequete(new WDChaineA("https://content.dropboxapi.com/1/files/auto/").opPlus(WDAPIChaine.extraitChaine(vWD_ch,1,new WDChaineA("."))).opPlus(".png").getString(),new WDChaineA("").getString(),new WDChaineA("Authorization: Bearer ").opPlus(vWD_gsKey),new WDChaineA(""),new WDChaineA("").getString(),new WDChaineA("").getString(),new WDChaineA("").getString()));

// HTTPGetResult(httpResult)
WDAPIHttp.HTTPDonneResultat(2);

// IMG_SansNom1 = HTTPGetResult(httpResult)
mWD_IMG_SansNom1.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// dSauveImagePNG(IMG_SansNom1,ch+".png")
WDAPIDessin.dSauveImagePNG(mWD_IMG_SansNom1,vWD_ch.opPlus(".png").getString());

// MaChaine est une chaine=ChaîneVersUTF8(xml)

vWD_MaChaine.setValeur(WDAPIChaine.chaineVersUTF8(vWD_xml));


// SAI_Date2= ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Date>"),1,"</Date>")
mWD_SAI_Date2.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Date>")),1,new WDChaineA("</Date>")));

// SAI_Heure=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Heure>"),1,"</Heure>")//sDataXML.Fiche.Heure
mWD_SAI_Heure.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Heure>")),1,new WDChaineA("</Heure>")));

// SAI_NomClient=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Nom>"),1,"</Nom>")//sDataXML.Fiche.Client.Nom
mWD_SAI_NomClient.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Nom>")),1,new WDChaineA("</Nom>")));

// SAI_Technicien=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Techni>"),1,"</Techni>")//sDataXML.Fiche.Client.Nom
mWD_SAI_Technicien.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Techni>")),1,new WDChaineA("</Techni>")));

// SAI_Service=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Service>"),1,"</Service>")// sDataXML.Fiche.Client.Service
mWD_SAI_Service.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Service>")),1,new WDChaineA("</Service>")));

// SAI_Addresse=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Addresse>"),1,"</Addresse>")//sDataXML.Fiche.Client.Addresse
mWD_SAI_Addresse.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Addresse>")),1,new WDChaineA("</Addresse>")));

// SAI_Ville2=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Ville>"),1,"</Ville>")//sDataXML.Fiche.Client.Ville
mWD_SAI_Ville2.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Ville>")),1,new WDChaineA("</Ville>")));

// SAI_Telephone1=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Telephone>"),1,"</Telephone>")//sDataXML.Fiche.Client.Telephone
mWD_SAI_Telephone1.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Telephone>")),1,new WDChaineA("</Telephone>")));

// SAI_Problemes=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Probleme>"),1,"</Probleme>")//sDataXML.Fiche.Probleme
mWD_SAI_Problemes.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Probleme>")),1,new WDChaineA("</Probleme>")));

// SAI_Date1=ExtraitChaîne(ExtraitChaîne(MaChaîne,3,"<Date>"),1,"</Date>")//sDataXML.Fiche.Intervention.Date
mWD_SAI_Date1.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,3,new WDChaineA("<Date>")),1,new WDChaineA("</Date>")));

// SAI_Heure_d_arrivée=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<HeureArrivé>"),1,"</HeureArrivé>")//sDataXML.Fiche.Intervention.HeureArrive
mWD_SAI_Heure_d_arrivee.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<HeureArrivé>")),1,new WDChaineA("</HeureArrivé>")));

// SAI_Heure_départ=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<HeureDepart>"),1,"</HeureDepart>")//sDataXML.Fiche.Intervention.HeureDepart
mWD_SAI_Heure_depart.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<HeureDepart>")),1,new WDChaineA("</HeureDepart>")));

// SAI_Problemes1=ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Detail>"),1,"</Detail>")//sDataXML.Fiche.Intervention.Detail
mWD_SAI_Problemes1.setValeur(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Detail>")),1,new WDChaineA("</Detail>")));

// entieDepla est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<Deplacement>"),1,"</Deplacement>"))// sDataXML.Fiche.Deplacement 

vWD_entieDepla.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<Deplacement>")),1,new WDChaineA("</Deplacement>"))));


// SI entieDepla=-1 ALORS 
if(vWD_entieDepla.opEgal(-1))
{
// 	INT_SansNom2[1]=False
mWD_INT_SansNom2.get(1).setValeur(false);

// 	SEL_Civilités..Visible=False 
mWD_SEL_Civilites.setVisible(false);

}
else
{
// 	INT_SansNom2[1]=True
mWD_INT_SansNom2.get(1).setValeur(true);

// 	SEL_Civilités..Visible=True
mWD_SEL_Civilites.setVisible(true);

// 	SELON(entieDepla)
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
WDObjet _WDExpSelon0 = vWD_entieDepla;
if(_WDExpSelon0.opEgal(1))
{
// 			SEL_Civilités=1
mWD_SEL_Civilites.setValeur(1);

}
else if(_WDExpSelon0.opEgal(2))
{
// 			SEL_Civilités=2
mWD_SEL_Civilites.setValeur(2);

}
else if(_WDExpSelon0.opEgal(3))
{
// 			SEL_Civilités=3
mWD_SEL_Civilites.setValeur(3);

}
else if(_WDExpSelon0.opEgal(4))
{
// 			SEL_Civilités=4
mWD_SEL_Civilites.setValeur(4);

}

}

}

// HeureInfo est un entier = val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainInformatique>"),1,"</MainInformatique>"))//sDataXML.Fiche.MainInformatique 

vWD_HeureInfo.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainInformatique>")),1,new WDChaineA("</MainInformatique>"))));


// SI HeureInfo=-1 ALORS 
if(vWD_HeureInfo.opEgal(-1))
{
// 	INT_SansNom1[1]=False 
mWD_INT_SansNom1.get(1).setValeur(false);

// 	SAI_HeureInfo..Visible=Faux
mWD_SAI_HeureInfo.setVisible(false);

}
else
{
// 	INT_SansNom1[1]=True 
mWD_INT_SansNom1.get(1).setValeur(true);

// 	SAI_HeureInfo..Visible=True
mWD_SAI_HeureInfo.setVisible(true);

// 	SAI_HeureInfo=HeureInfo
mWD_SAI_HeureInfo.setValeur(vWD_HeureInfo);

}

// HeureImpri est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainImprimante>"),1,"</MainImprimante>"))// sDataXML.Fiche.MainImprimante 

vWD_HeureImpri.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainImprimante>")),1,new WDChaineA("</MainImprimante>"))));


// SI HeureImpri=-1 ALORS 
if(vWD_HeureImpri.opEgal(-1))
{
// 	INT_SansNom1[2]=False 
mWD_INT_SansNom1.get(2).setValeur(false);

// 	SAI_HeureImprimante..Visible=Faux
mWD_SAI_HeureImprimante.setVisible(false);

}
else
{
// 	INT_SansNom1[2]=True 
mWD_INT_SansNom1.get(2).setValeur(true);

// 	SAI_HeureImprimante..Visible=True
mWD_SAI_HeureImprimante.setVisible(true);

// 	SAI_HeureImprimante=HeureImpri
mWD_SAI_HeureImprimante.setValeur(vWD_HeureImpri);

}

// HeureCopieur est un entier =val(ExtraitChaîne(ExtraitChaîne(MaChaîne,2,"<MainCopieur>"),1,"</MainCopieur>")) //sDataXML.Fiche.MainCopieur 

vWD_HeureCopieur.setValeur(WDAPIChaine.val(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_MaChaine,2,new WDChaineA("<MainCopieur>")),1,new WDChaineA("</MainCopieur>"))));


// SI HeureCopieur=-1 ALORS 
if(vWD_HeureCopieur.opEgal(-1))
{
// 	INT_SansNom1[3]=False 
mWD_INT_SansNom1.get(3).setValeur(false);

// 	SAI_Copieur..Visible=Faux
mWD_SAI_Copieur.setVisible(false);

}
else
{
// 	INT_SansNom1[3]=True 
mWD_INT_SansNom1.get(3).setValeur(true);

// 	SAI_Copieur..Visible=True	
mWD_SAI_Copieur.setVisible(true);

// 	SAI_Copieur=HeureCopieur
mWD_SAI_Copieur.setValeur(vWD_HeureCopieur);

}

// TableSupprimeTout(TABLE_SansNom1)
WDAPITable.tableSupprimeTout(mWD_TABLE_SansNom1);

// nbOccurence est un entier=ChaîneOccurrence(MaChaine,"<iece>")

vWD_nbOccurence.setValeur(WDAPIChaine.chaineOccurrence(vWD_MaChaine,new WDChaineA("<iece>")));


// POUR i=1 a nbOccurence
for(WDObjet vWD_i = new WDEntier(1);vWD_i.opInfEgal(vWD_nbOccurence);vWD_i.opInc())
{
// 	ch1 est une chaine=Remplace(ExtraitChaîne(MaChaine,1+i,"<iece>"),"</iece>","")
WDObjet vWD_ch1= new WDChaineA();


vWD_ch1.setValeur(WDAPIChaine.remplace(WDAPIChaine.extraitChaine(vWD_MaChaine,new WDEntier(1).opPlus(vWD_i).getInt(),new WDChaineA("<iece>")),new WDChaineA("</iece>"),new WDChaineA("")));


// 	TableInsèreLigne(TABLE_SansNom1,1,(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Desi>"),1,"</Desi>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<NSerie>"),1,"</NSerie>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Quantite>"),1,"</Quantite>")),(ExtraitChaîne(ExtraitChaîne(ch1,2,"<Prixht>"),1,"</Prixht>")))
WDAPITable.tableInsereLigne(mWD_TABLE_SansNom1,1,new Object[] {WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Desi>")),1,new WDChaineA("</Desi>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<NSerie>")),1,new WDChaineA("</NSerie>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Quantite>")),1,new WDChaineA("</Quantite>")),WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch1,2,new WDChaineA("<Prixht>")),1,new WDChaineA("</Prixht>"))} );

}

// TableAffiche(TABLE_SansNom1)
WDAPITable.tableAffiche(mWD_TABLE_SansNom1);

}
finally
{
finExecProcLocale();
}

}



/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Notes.ACTB_ActionBar
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

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_Sauvegarder extends WDOptionMenu
{
public GWDMOPT_Sauvegarder(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672664677352343l);

super.setNom("OPT_Sauvegarder");

super.setType(40001);

super.setLibelle("Sauvegarder");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(3);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// Sauvegarde()
fWD_sauvegarde();

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Sauvegarder mWD_OPT_Sauvegarder = new GWDMOPT_Sauvegarder(true);


class GWDMOPT_Ouvrir extends WDOptionMenu
{
public GWDMOPT_Ouvrir(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672664677417879l);

super.setNom("OPT_Ouvrir");

super.setType(40001);

super.setLibelle("Ouvrir");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(5);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// SI OuiNon("voulez vous enregistrer les modification ?")=Oui ALORS
if(WDAPIDialogue.ouiNon(new WDChaineA("voulez vous enregistrer les modification ?").getString()).opEgal(1))
{
// 	Sauvegarde()
fWD_sauvegarde();

}

// OuvreFille(Express_FEN_SansNom2)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Ouvrir mWD_OPT_Ouvrir = new GWDMOPT_Ouvrir(true);


class GWDMOPT_Sauvegarder_Dropbox extends WDOptionMenu
{
public GWDMOPT_Sauvegarder_Dropbox(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672664677483415l);

super.setNom("OPT_Sauvegarder_Dropbox");

super.setType(40001);

super.setLibelle("Sauvegarder Dropbox");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(6);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sBeforefront= new WDChaineA();



// sBeforefront is string


// Sauvegarde()
fWD_sauvegarde();

// sBeforefront=HTTPRequête("https://content.dropboxapi.com/1/files_put/auto/"+gsChaine+".xml?overwrite=false&autorename=true","","Authorization: Bearer "+gsKey ,fChargeBuffer("/sdcard/pfsi-Fiches/"+gsChaine+".xml"),"text/xml","","")
vWD_sBeforefront.setValeur(WDAPIHttp.HTTPRequete(new WDChaineA("https://content.dropboxapi.com/1/files_put/auto/").opPlus(vWD_gsChaine).opPlus(".xml?overwrite=false&autorename=true").getString(),new WDChaineA("").getString(),new WDChaineA("Authorization: Bearer ").opPlus(vWD_gsKey),WDAPIFichier.fChargeBuffer(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".xml").getString()),new WDChaineA("text/xml").getString(),new WDChaineA("").getString(),new WDChaineA("").getString()));

// sBeforefront=HTTPRequête("https://content.dropboxapi.com/1/files_put/auto/"+gsChaine+".png?overwrite=false&autorename=true","","Authorization: Bearer "+ gsKey ,fChargeBuffer("/sdcard/pfsi-Fiches/"+gsChaine+".png"),"text/xml","","")
vWD_sBeforefront.setValeur(WDAPIHttp.HTTPRequete(new WDChaineA("https://content.dropboxapi.com/1/files_put/auto/").opPlus(vWD_gsChaine).opPlus(".png?overwrite=false&autorename=true").getString(),new WDChaineA("").getString(),new WDChaineA("Authorization: Bearer ").opPlus(vWD_gsKey),WDAPIFichier.fChargeBuffer(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".png").getString()),new WDChaineA("text/xml").getString(),new WDChaineA("").getString(),new WDChaineA("").getString()));

// HTTPGetResult(httpResult)
WDAPIHttp.HTTPDonneResultat(2);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Sauvegarder_Dropbox mWD_OPT_Sauvegarder_Dropbox = new GWDMOPT_Sauvegarder_Dropbox(true);


class GWDMOPT_Ouvrir_Dropbox extends WDOptionMenu
{
public GWDMOPT_Ouvrir_Dropbox(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672664677548951l);

super.setNom("OPT_Ouvrir_Dropbox");

super.setType(40001);

super.setLibelle("Ouvrir Dropbox");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(7);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// SI OuiNon("voulez vous enregistrer les modification ?")=Oui ALORS
if(WDAPIDialogue.ouiNon(new WDChaineA("voulez vous enregistrer les modification ?").getString()).opEgal(1))
{
// 	Sauvegarde()
fWD_sauvegarde();

}

// Ouvrefille(Express_FEN_SansNom1)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom1);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Ouvrir_Dropbox mWD_OPT_Ouvrir_Dropbox = new GWDMOPT_Ouvrir_Dropbox(true);


class GWDMOPT_Changer_cle extends WDOptionMenu
{
public GWDMOPT_Changer_cle(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672664677614487l);

super.setNom("OPT_Changer_clé");

super.setType(40001);

super.setLibelle("Changer clé");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(4);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// OuvreFille(Express_FEN_ModifKEY)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_ModifKEY);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Changer_cle mWD_OPT_Changer_cle = new GWDMOPT_Changer_cle(true);


class GWDMOPT_Supprimer_Dropbox extends WDOptionMenu
{
public GWDMOPT_Supprimer_Dropbox(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834682775078465411l);

super.setNom("OPT_Supprimer_Dropbox");

super.setType(40001);

super.setLibelle("Supprimer Dropbox");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(8);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// OuvreFille(EXPRESS_FEN_SuppressionDp)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SuppressionDp);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Supprimer_Dropbox mWD_OPT_Supprimer_Dropbox = new GWDMOPT_Supprimer_Dropbox(true);

public void initialiserSousObjets()
{
mWD_OPT_Sauvegarder.initialiserObjet();
super.ajouterMenu(mWD_OPT_Sauvegarder);
mWD_OPT_Ouvrir.initialiserObjet();
super.ajouterMenu(mWD_OPT_Ouvrir);
mWD_OPT_Sauvegarder_Dropbox.initialiserObjet();
super.ajouterMenu(mWD_OPT_Sauvegarder_Dropbox);
mWD_OPT_Ouvrir_Dropbox.initialiserObjet();
super.ajouterMenu(mWD_OPT_Ouvrir_Dropbox);
mWD_OPT_Changer_cle.initialiserObjet();
super.ajouterMenu(mWD_OPT_Changer_cle);
mWD_OPT_Supprimer_Dropbox.initialiserObjet();
super.ajouterMenu(mWD_OPT_Supprimer_Dropbox);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664677286807l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



class GWDMMENU_MenuContextuel1 extends WDMenuContextuel
{

class GWDMOPT_Supprimer extends WDOptionMenu
{
public GWDMOPT_Supprimer(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_MenuContextuel1.this);
super.setQuid(2834672664677745559l);

super.setNom("OPT_Supprimer");

super.setType(40001);

super.setLibelle("Supprimer");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(2);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}
}
public GWDMOPT_Supprimer mWD_OPT_Supprimer = new GWDMOPT_Supprimer(true);

public void initialiserSousObjets()
{
mWD_OPT_Supprimer.initialiserObjet();
super.ajouterMenu(mWD_OPT_Supprimer);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672664677680023l);

super.setNom("MENU_MenuContextuel1");

super.setType(40001);

super.setTitreMenu("");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return false;
}
}
public GWDMMENU_MenuContextuel1 mWD_MENU_MenuContextuel1;



/**
 * Traitement: Déclarations globales de EXPRESS_FEN_Notes
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// gsChaine est une chaine= "/sdcard/pfsi-Fiches/test"
vWD_gsChaine= new WDChaineA();

vWD_gsChaine.setValeur("/sdcard/pfsi-Fiches/test");

super.ajouterVariableGlobale("gsChaine",vWD_gsChaine);



// ValeurFenetreFille est une chaine
vWD_ValeurFenetreFille= new WDChaineA();

super.ajouterVariableGlobale("ValeurFenetreFille",vWD_ValeurFenetreFille);



// gsKey est une chaine
vWD_gsKey= new WDChaineA();

super.ajouterVariableGlobale("gsKey",vWD_gsKey);



// SI fFichierExiste(fRepExe+"/fichier"+".txt") ALORS
if(WDAPIFichier.fFichierExiste(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString()).getBoolean())
{
// 	gsKey = fChargeTexte(fRepExe+"/fichier"+".txt")
vWD_gsKey.setValeur(WDAPIFichier.fChargeTexte(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString()));

}
else
{
// 	gsKey="Q9D4Z4nRl64AAAAAAAAAXLhdWWVU-c-mMmhEchdR7buS5BRr-2LQHo4pJ4q74vpn"
vWD_gsKey.setValeur("Q9D4Z4nRl64AAAAAAAAAXLhdWWVU-c-mMmhEchdR7buS5BRr-2LQHo4pJ4q74vpn");

// 	fSauveTexte(fRepExe+"/fichier"+".txt", gsKey)
WDAPIFichier.fSauveTexte(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString(),vWD_gsKey);

}

// si fRépertoireExiste("/sdcard/pfsi-Fiches/") alors
if(WDAPIFichier.fRepertoireExiste(new WDChaineA("/sdcard/pfsi-Fiches/").getString()).getBoolean())
{
}
else
{
// 	fRepCrée("/sdcard/pfsi-Fiches/")
WDAPIFichier.fRepCree(new WDChaineA("/sdcard/pfsi-Fiches/").getString());

}

// OuvreFille(Express_FEN_SansNom2)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2);

// gsLIGNE est une entier
vWD_gsLIGNE= new WDEntier();

super.ajouterVariableGlobale("gsLIGNE",vWD_gsLIGNE);



}



/**
 * Traitement: Fermeture d'une fenêtre fille de EXPRESS_FEN_Notes
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// ValeurFenêtreFille = MaFenêtreFille..ValeurRenvoyée
vWD_ValeurFenetreFille.setValeur(WDContexte.getMaFenetreFille().getValeurRenvoyee());

// si MaFenêtreFille..Nom="FEN_SansNom1" ALORS
if(WDContexte.getMaFenetreFille().getNom().opEgal("FEN_SansNom1"))
{
// 	OuvertureDropbox(ValeurFenetreFille)
fWD_ouvertureDropbox(vWD_ValeurFenetreFille);

// 	gsChaine=ExtraitChaine(ValeurFenetreFille,1,".xml")
vWD_gsChaine.setValeur(WDAPIChaine.extraitChaine(vWD_ValeurFenetreFille,1,new WDChaineA(".xml")));

// 	SAI_titre=gsChaine
mWD_SAI_titre.setValeur(vWD_gsChaine);

}
else if(WDContexte.getMaFenetreFille().getNom().opEgal("FEN_SansNom2"))
{
// 	gsChaine=ValeurFenetreFille
vWD_gsChaine.setValeur(vWD_ValeurFenetreFille);

// 	Ouvrir1(ValeurFenetreFille)
fWD_ouvrir1(vWD_ValeurFenetreFille);

// 	SAI_titre=gsChaine
mWD_SAI_titre.setValeur(vWD_gsChaine);

}
else if(WDContexte.getMaFenetreFille().getNom().opEgal("FEN_Fiche_Pieces"))
{
// 	TableAjouteLigne(TABLE_SansNom1,ExtraitChaîne(ValeurFenetreFille,1,TAB),ExtraitChaîne(ValeurFenetreFille,2,TAB),ExtraitChaîne(ValeurFenetreFille,4,TAB),ExtraitChaîne(ValeurFenetreFille,3,TAB))
WDAPITable.tableAjouteLigne(mWD_TABLE_SansNom1,new Object[] {WDAPIChaine.extraitChaine(vWD_ValeurFenetreFille,1,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ValeurFenetreFille,2,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ValeurFenetreFille,4,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ValeurFenetreFille,3,new WDChaineA("\t"))} );

// 	TableAffiche(TABLE_SansNom1)
WDAPITable.tableAffiche(mWD_TABLE_SansNom1);

}
else if(WDContexte.getMaFenetreFille().getNom().opEgal("FEN_Edition"))
{
// 	Multitache(70)
WDAPIVM.multitache(70);

// 	IMG_SansNom1=IMG_SansNom2
mWD_IMG_SansNom1.setValeur(mWD_IMG_SansNom2);

// 	IMG_SansNom1="/sdcard/pfsi-Fiches/"+gsChaine+".png"
mWD_IMG_SansNom1.setValeur(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsChaine).opPlus(".png"));

}
else if(WDContexte.getMaFenetreFille().getNom().opEgal("FEN_Edit_Piece"))
{
// 	ResSelect est un entier
WDObjet vWD_ResSelect= new WDEntier();



// 	ResSelect = TableSelect(TABLE_SansNom1)
vWD_ResSelect.setValeur(WDAPITable.tableSelect(mWD_TABLE_SansNom1));

// 	SI ResSelect<>-1 ALORS
if(vWD_ResSelect.opDiff(-1))
{
// 		ch est une chaine=ValeurFenetreFille
WDObjet vWD_ch= new WDChaineA();


vWD_ch.setValeur(vWD_ValeurFenetreFille);


// 		TableModifieLigne(TABLE_SansNom1,gsLIGNE,ExtraitChaîne(ch,1,TAB),ExtraitChaîne(ch,2,TAB),ExtraitChaîne(ch,4,TAB),ExtraitChaîne(ch,3,TAB))
WDAPITable.tableModifieLigne(mWD_TABLE_SansNom1,vWD_gsLIGNE.getInt(),new Object[] {WDAPIChaine.extraitChaine(vWD_ch,1,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ch,2,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ch,4,new WDChaineA("\t")),WDAPIChaine.extraitChaine(vWD_ch,3,new WDChaineA("\t"))} );

// 		TableAffiche(TABLE_SansNom1)
WDAPITable.tableAffiche(mWD_TABLE_SansNom1);

// 		gsLIGNE=-1
vWD_gsLIGNE.setValeur(-1);

}

}

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsChaine = WDVarNonAllouee.ref;
 public WDObjet vWD_ValeurFenetreFille = WDVarNonAllouee.ref;
 public WDObjet vWD_gsKey = WDVarNonAllouee.ref;
 public WDObjet vWD_gsLIGNE = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_Notes
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD__EXPRESSVersion1 = new GWD_EXPRESSVersion1();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_SAI_Date2 = new GWDSAI_Date2();
mWD_SAI_Heure = new GWDSAI_Heure();
mWD_SAI_NomClient = new GWDSAI_NomClient();
mWD_SAI_Addresse = new GWDSAI_Addresse();
mWD_SAI_Ville2 = new GWDSAI_Ville2();
mWD_SAI_Telephone1 = new GWDSAI_Telephone1();
mWD_SAI_Problemes1 = new GWDSAI_Problemes1();
mWD_SAI_Date1 = new GWDSAI_Date1();
mWD_SAI_Heure_d_arrivee = new GWDSAI_Heure_d_arrivee();
mWD_SAI_Heure_depart = new GWDSAI_Heure_depart();
mWD_SAI_Problemes = new GWDSAI_Problemes();
mWD_BTN_Ajouter = new GWDBTN_Ajouter();
mWD_BTN_Supprimer_Ligne = new GWDBTN_Supprimer_Ligne();
mWD_BTN_SansNom3 = new GWDBTN_SansNom3();
mWD_SAI_Service = new GWDSAI_Service();
mWD_INT_SansNom2 = new GWDINT_SansNom2();
mWD_SEL_Civilites = new GWDSEL_Civilites();
mWD_INT_SansNom1 = new GWDINT_SansNom1();
mWD_SAI_HeureImprimante = new GWDSAI_HeureImprimante();
mWD_SAI_Copieur = new GWDSAI_Copieur();
mWD_SAI_HeureInfo = new GWDSAI_HeureInfo();
mWD_TABLE_SansNom1 = new GWDTABLE_SansNom1();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();
mWD_SAI_titre = new GWDSAI_titre();
mWD_BTN_Creer1 = new GWDBTN_Creer1();
mWD_SAI_Technicien = new GWDSAI_Technicien();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();
mWD_MENU_MenuContextuel1 = new GWDMMENU_MenuContextuel1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Notes
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834672664674206583l);

super.setChecksum("957665597");

super.setNom("EXPRESS_FEN_Notes");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(2170, 551);

super.setTitre("Fiche");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Notes
////////////////////////////////////////////////////////////////////////////
mWD__EXPRESSVersion1.initialiserObjet();
super.ajouter("#EXPRESSVersion1", mWD__EXPRESSVersion1);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_SAI_Date2.initialiserObjet();
super.ajouter("SAI_Date2", mWD_SAI_Date2);
mWD_SAI_Heure.initialiserObjet();
super.ajouter("SAI_Heure", mWD_SAI_Heure);
mWD_SAI_NomClient.initialiserObjet();
super.ajouter("SAI_NomClient", mWD_SAI_NomClient);
mWD_SAI_Addresse.initialiserObjet();
super.ajouter("SAI_Addresse", mWD_SAI_Addresse);
mWD_SAI_Ville2.initialiserObjet();
super.ajouter("SAI_Ville2", mWD_SAI_Ville2);
mWD_SAI_Telephone1.initialiserObjet();
super.ajouter("SAI_Telephone1", mWD_SAI_Telephone1);
mWD_SAI_Problemes1.initialiserObjet();
super.ajouter("SAI_Problemes1", mWD_SAI_Problemes1);
mWD_SAI_Date1.initialiserObjet();
super.ajouter("SAI_Date1", mWD_SAI_Date1);
mWD_SAI_Heure_d_arrivee.initialiserObjet();
super.ajouter("SAI_Heure_d_arrivée", mWD_SAI_Heure_d_arrivee);
mWD_SAI_Heure_depart.initialiserObjet();
super.ajouter("SAI_Heure_départ", mWD_SAI_Heure_depart);
mWD_SAI_Problemes.initialiserObjet();
super.ajouter("SAI_Problemes", mWD_SAI_Problemes);
mWD_BTN_Ajouter.initialiserObjet();
super.ajouter("BTN_Ajouter", mWD_BTN_Ajouter);
mWD_BTN_Supprimer_Ligne.initialiserObjet();
super.ajouter("BTN_Supprimer_Ligne", mWD_BTN_Supprimer_Ligne);
mWD_BTN_SansNom3.initialiserObjet();
super.ajouter("BTN_SansNom3", mWD_BTN_SansNom3);
mWD_SAI_Service.initialiserObjet();
super.ajouter("SAI_Service", mWD_SAI_Service);
mWD_INT_SansNom2.initialiserObjet();
super.ajouter("INT_SansNom2", mWD_INT_SansNom2);
mWD_SEL_Civilites.initialiserObjet();
super.ajouter("SEL_Civilités", mWD_SEL_Civilites);
mWD_INT_SansNom1.initialiserObjet();
super.ajouter("INT_SansNom1", mWD_INT_SansNom1);
mWD_SAI_HeureImprimante.initialiserObjet();
super.ajouter("SAI_HeureImprimante", mWD_SAI_HeureImprimante);
mWD_SAI_Copieur.initialiserObjet();
super.ajouter("SAI_Copieur", mWD_SAI_Copieur);
mWD_SAI_HeureInfo.initialiserObjet();
super.ajouter("SAI_HeureInfo", mWD_SAI_HeureInfo);
mWD_TABLE_SansNom1.initialiserObjet();
super.ajouter("TABLE_SansNom1", mWD_TABLE_SansNom1);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);
mWD_SAI_titre.initialiserObjet();
super.ajouter("SAI_titre", mWD_SAI_titre);
mWD_BTN_Creer1.initialiserObjet();
super.ajouter("BTN_Créer1", mWD_BTN_Creer1);
mWD_SAI_Technicien.initialiserObjet();
super.ajouter("SAI_Technicien", mWD_SAI_Technicien);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);
mWD_MENU_MenuContextuel1.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_MenuContextuel1);

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
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Notes;
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
