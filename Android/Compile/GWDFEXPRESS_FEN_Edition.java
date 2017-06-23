/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Edition
 * Date : 07/06/2016 15:47:14
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Edition extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Edition
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_Note
 */
class GWDIMG_Note extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Edition.IMG_Note
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140680996474l);

super.setChecksum("928218117");

super.setNom("IMG_Note");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(252, 533);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 500, 1000);

super.setTransparence(1);

super.setParamImage(327681, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Survol souris (WM_MOUSEMOVE) sur IMG_Note
 */
public void survolSouris()
{
super.survolSouris();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nCouleur= new WDEntier();

WDObjet vWD_nx= new WDEntier();

WDObjet vWD_ny= new WDEntier();

WDObjet vWD_dnx= new WDEntier();

WDObjet vWD_dny= new WDEntier();



// nCouleur est un entier


// nx, ny sont des entiers



// dnx, dny sont des entiers



// SI gbCrayonEnfoncé ALORS
if(vWD_gbCrayonEnfonce.getBoolean())
{
// 	nx = SourisPosX()
vWD_nx.setValeur(WDAPIDivers.sourisPosX());

// 	ny = SourisPosY()
vWD_ny.setValeur(WDAPIDivers.sourisPosY());

// 	SI PAS gbEnModeCrayon ALORS
if((!vWD_gbEnModeCrayon.getBoolean()))
{
// 		nCouleur = iBlanc
vWD_nCouleur.setValeur(16777215);

}
else
{
// 		nCouleur = gnCouleurEnCours
vWD_nCouleur.setValeur(vWD_gnCouleurEnCours);

}

// 	SI gnX <> 0 ALORS
if(vWD_gnX.opDiff(0))
{
// 		dnx = gnX
vWD_dnx.setValeur(vWD_gnX);

}
else
{
// 		dnx = nx
vWD_dnx.setValeur(vWD_nx);

}

// 	SI gnY <> 0 ALORS
if(vWD_gnY.opDiff(0))
{
// 		dny = gnY
vWD_dny.setValeur(vWD_gnY);

}
else
{
// 		dny = ny
vWD_dny.setValeur(vWD_ny);

}

// 	dLigne(dnx, dny, nx, ny, nCouleur, gnTailleCrayon)	
WDAPIDessin.dLigne(vWD_dnx.getInt(),vWD_dny.getInt(),vWD_nx.getInt(),vWD_ny.getInt(),vWD_nCouleur.getInt(),vWD_gnTailleCrayon.getInt());

// 	gnX = nx
vWD_gnX.setValeur(vWD_nx);

// 	gnY = ny
vWD_gnY.setValeur(vWD_ny);

}

}



/**
 * Traitement: Touché / Bouton gauche enfoncé de IMG_Note
 */
public void appuiSurBoutonGauche()
{
super.appuiSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nCouleur= new WDEntier();



// nCouleur est un entier


// SI PAS gbEnModeCrayon ALORS
if((!vWD_gbEnModeCrayon.getBoolean()))
{
// 	nCouleur = iBlanc
vWD_nCouleur.setValeur(16777215);

}
else
{
// 	nCouleur = gnCouleurEnCours
vWD_nCouleur.setValeur(vWD_gnCouleurEnCours);

}

// gbCrayonEnfoncé = Vrai
vWD_gbCrayonEnfonce.setValeur(true);

// dLigne(SourisPosX(), SourisPosY(), SourisPosX(), SourisPosY(), nCouleur, gnTailleCrayon)
WDAPIDessin.dLigne(WDAPIDivers.sourisPosX().getInt(),WDAPIDivers.sourisPosY().getInt(),WDAPIDivers.sourisPosX().getInt(),WDAPIDivers.sourisPosY().getInt(),vWD_nCouleur.getInt(),vWD_gnTailleCrayon.getInt());

// gnX = SourisPosX()
vWD_gnX.setValeur(WDAPIDivers.sourisPosX());

// gnY = SourisPosY()
vWD_gnY.setValeur(WDAPIDivers.sourisPosY());

// gbEnregistré = Faux
vWD_gbEnregistre.setValeur(false);

// IMG_ENREGISTRER..Etat = Actif
mWD_IMG_Enregistrer.setEtat(0);

}



/**
 * Traitement: Relâché / Bouton gauche relâché de IMG_Note
 */
public void relacheBoutonGauche()
//  Désactive le dessin
{
super.relacheBoutonGauche();

// gbCrayonEnfoncé = Faux
vWD_gbCrayonEnfonce.setValeur(false);

// gnX = 0
vWD_gnX.setValeur(0);

// gnY = 0
vWD_gnY.setValeur(0);

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
super.activerEcouteurMouvement();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Note mWD_IMG_Note;

/**
 * IMG_Image1
 */
class GWDIMG_Image1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Edition.IMG_Image1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681062010l);

super.setChecksum("928283653");

super.setNom("IMG_Image1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(252, 0);

super.setTailleInitiale(1, 533);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\séparateur_noir.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(3, 0, true, 2500);

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
public GWDIMG_Image1 mWD_IMG_Image1;

/**
 * IMG_Enregistrer
 */
class GWDIMG_Enregistrer extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_Edition.IMG_Enregistrer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681127546l);

super.setChecksum("928349189");

super.setNom("IMG_Enregistrer");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(270, 31);

super.setTailleInitiale(48, 48);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ic_menu_save.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 2500);

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

/**
 * Traitement: Clic sur IMG_Enregistrer
 */
public void clicSurBoutonGauche()
//  On enregistre
{
super.clicSurBoutonGauche();

// Enregistrer()
fWD_enregistrer();

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
public GWDIMG_Enregistrer mWD_IMG_Enregistrer;

/**
 * BTN_OUTILDESSIN
 */
class GWDBTN_OUTILDESSIN extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_Edition.BTN_OUTILDESSIN
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681193082l);

super.setChecksum("928412901");

super.setNom("BTN_OUTILDESSIN");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(270, 113);

super.setTailleInitiale(48, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

super.setNumTab(1);

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

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xCECECE, 0xB7FE, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xCECECE, 0xB7FE, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xCECECE, 0xB7FE, 4, 4);

super.setImageFond("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\crayon.png", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de BTN_OUTILDESSIN
 */
public void init()
{
super.init();

// MoiMême..ImageFond = IMG_Crayon
WDContexte.getMoiMeme().setImageFond(mWD_IMG_Crayon.getString());

}



/**
 * Traitement: Clic sur BTN_OUTILDESSIN
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI gbEnModeCrayon ALORS
if(vWD_gbEnModeCrayon.getBoolean())
{
// 	BTN_OUTILDESSIN..ImageFond = IMG_Gomme
this.setImageFond(mWD_IMG_Gomme.getString());

// 	COULEUR_EN_COURS..CouleurFond = iBlanc
mWD_COULEUR_EN_COURS.setCouleurFond(16777215);

// 	COULEUR_EN_COURS..Etat = Grisé
mWD_COULEUR_EN_COURS.setEtat(4);

// 	gnTailleCrayon = 50
vWD_gnTailleCrayon.setValeur(50);

// 	COMBO_Taille = 8
mWD_COMBO_Taille.setValeur(8);

// 	gbEnModeCrayon = Faux
vWD_gbEnModeCrayon.setValeur(false);

}
else
{
// 	BTN_OUTILDESSIN..ImageFond = IMG_Crayon
this.setImageFond(mWD_IMG_Crayon.getString());

// 	COULEUR_EN_COURS..CouleurFond = gnCouleurEnCours
mWD_COULEUR_EN_COURS.setCouleurFond(vWD_gnCouleurEnCours.getInt());

// 	COULEUR_EN_COURS..Etat = Actif
mWD_COULEUR_EN_COURS.setEtat(0);

// 	gnTailleCrayon = 2
vWD_gnTailleCrayon.setValeur(2);

// 	COMBO_Taille = 2
mWD_COMBO_Taille.setValeur(2);

// 	gbEnModeCrayon = Vrai
vWD_gbEnModeCrayon.setValeur(true);

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
public GWDBTN_OUTILDESSIN mWD_BTN_OUTILDESSIN;

/**
 * IMG_Gomme
 */
class GWDIMG_Gomme extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_Edition.IMG_Gomme
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681258618l);

super.setChecksum("928480261");

super.setNom("IMG_Gomme");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(12, 545);

super.setTailleInitiale(48, 48);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\gomme.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 2500);

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
public GWDIMG_Gomme mWD_IMG_Gomme;

/**
 * COMBO_Taille
 */
class GWDCOMBO_Taille extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_Edition.COMBO_Taille
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,171,48);
super.setNom("COMBO_Taille");

super.setType(10002);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(266, 277);

super.setTailleInitiale(52, 171);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\ActivAndroid 4-HoloLight_Combo.png?E5_3NP_36_1_46_8", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {8, 46, 1, 36}, 5, 5);

super.setStyleElement(0x0, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 48);

super.setStyleSelection(0x0, 0xEFD385, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de COMBO_Taille
 */
public void init()
//  Vide la liste
{
super.init();

// ListeSupprimeTout(COMBO_Taille)
WDAPIListe.listeSupprimeTout(this);

// ListeAjoute(COMBO_Taille, 1)
WDAPIListe.listeAjoute(this,new WDEntier(1).getString());

// ListeAjoute(COMBO_Taille, 2)
WDAPIListe.listeAjoute(this,new WDEntier(2).getString());

// ListeAjoute(COMBO_Taille, 3)
WDAPIListe.listeAjoute(this,new WDEntier(3).getString());

// ListeAjoute(COMBO_Taille, 5)
WDAPIListe.listeAjoute(this,new WDEntier(5).getString());

// ListeAjoute(COMBO_Taille, 10)
WDAPIListe.listeAjoute(this,new WDEntier(10).getString());

// ListeAjoute(COMBO_Taille, 20)
WDAPIListe.listeAjoute(this,new WDEntier(20).getString());

// ListeAjoute(COMBO_Taille, 30)
WDAPIListe.listeAjoute(this,new WDEntier(30).getString());

// ListeAjoute(COMBO_Taille, 50)
WDAPIListe.listeAjoute(this,new WDEntier(50).getString());

// ListeAjoute(COMBO_Taille, 100)
WDAPIListe.listeAjoute(this,new WDEntier(100).getString());

// COMBO_Taille = 2
this.setValeur(2);

// ExécuteTraitement(COMBO_Taille, trtSélection)
WDAPIVM.executeTraitement(this,33);

}



/**
 * Traitement: Sélection d'une ligne de COMBO_Taille
 */
public void selectionLigne()
{
super.selectionLigne();

// gnTailleCrayon = COMBO_Taille[COMBO_Taille]..ValeurAffichée
vWD_gnTailleCrayon.setValeur(this.get(this).getValeurAffichee());

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_Taille mWD_COMBO_Taille;

/**
 * COULEUR_EN_COURS
 */
class GWDCOULEUR_EN_COURS extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_Edition.COULEUR_EN_COURS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681389690l);

super.setChecksum("928611333");

super.setNom("COULEUR_EN_COURS");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(266, 463);

super.setTailleInitiale(52, 68);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

super.setTransparence(1);

super.setParamImage(1, 0, true, 2500);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(true);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(2, 0xFFFFFFFF, 0xF5000000, 0x2A0000, 4, 4);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de COULEUR_EN_COURS
 */
public void init()
{
super.init();

// moimeme..couleurfond = gncouleurencours
WDContexte.getMoiMeme().setCouleurFond(vWD_gnCouleurEnCours.getInt());

}



/**
 * Traitement: Clic sur COULEUR_EN_COURS
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// ouvrefenetremobile(Express_FEN_SelecteurCouleur)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SelecteurCouleur);

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
public GWDCOULEUR_EN_COURS mWD_COULEUR_EN_COURS;

/**
 * IMG_Crayon
 */
class GWDIMG_Crayon extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_FEN_Edition.IMG_Crayon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681455226l);

super.setChecksum("928676869");

super.setNom("IMG_Crayon");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(102, 554);

super.setTailleInitiale(48, 48);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\crayon.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 2500);

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
public GWDIMG_Crayon mWD_IMG_Crayon;

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de EXPRESS_FEN_Edition.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681520762l);

super.setChecksum("928740581");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(270, 182);

super.setTailleInitiale(48, 77);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(5, 1000, 1000, 500, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\effacer.png", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreSurvol(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreEnfonce(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// dFinDessin(IMG_Note)
WDAPIDessin.dFinDessin(mWD_IMG_Note);

// dDébutDessin(IMG_Note)
WDAPIDessin.dDebutDessin(mWD_IMG_Note);

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
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de EXPRESS_FEN_Edition.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681586298l);

super.setChecksum("928805661");

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

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Edition.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de EXPRESS_FEN_Edition
////////////////////////////////////////////////////////////////////////////
//  Résumé : Enregistre la note
//  Syntaxe :
//  Enregistrer ()
// 
// 
public void fWD_enregistrer()
{
initExecProcLocale("Enregistrer");


try
{
// dSauveImagepng(IMG_Note,"/sdcard/pfsi-Fiches/"+gsName,100)
WDAPIDessin.dSauveImagePNG(mWD_IMG_Note,new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(vWD_gsName).getString(),100);

// ToastAffiche("image enregistrée")
WDAPIToast.toastAffiche(new WDChaineA("image enregistrée").getString());

}
finally
{
finExecProcLocale();
}

}


//  Résumé : Change la couleur de dessin
//  Syntaxe :
// ChangeCouleur (<nCouleur> est entier)
// 
//  Paramètres :
// 	nCouleur (entier) : la nouvelle couleur
public void fWD_changeCouleur( WDObjet vWD_nCouleur )
{
initExecProcLocale("ChangeCouleur");


try
{
vWD_nCouleur = WDParametre.traiterParametre(vWD_nCouleur, 1, false, 8);


// SI nCouleur <> 0 ALORS
if(vWD_nCouleur.opDiff(0))
{
// 	gnCouleurEnCours = nCouleur
vWD_gnCouleurEnCours.setValeur(vWD_nCouleur);

// 	COULEUR_EN_COURS..CouleurFond = nCouleur
mWD_COULEUR_EN_COURS.setCouleurFond(vWD_nCouleur.getInt());

}

}
finally
{
finExecProcLocale();
}

}


//  Résumé : Renvoyer le chemin de la dernière photo prise
//  Syntaxe :
// [ <Résultat> = ] RécupèreCheminNote ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	chaîne UNICODE : Le chemin de la dernière photo prise
// 
public WDObjet fWD_recupereCheminNote()
{
initExecProcLocale("RécupèreCheminNote");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sImage= new WDChaineA();

WDObjet vWD_sListeFichier= new WDChaineA();



// sImage est une chaine


// sListeFichier est une chaine


// sListeFichier = fListeFichier( ["\\"] +  "*.jpg", frNonRécursif)
vWD_sListeFichier.setValeur(WDAPIFichier.fListeFichier(new WDChaineOptionnelle("\\").opPlus("*.jpg").getString(),new WDEntier(2)));

// POUR TOUTE CHAINE UnFichier DE sListeFichier SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
WDObjet vWD_UnFichier = new WDChaineA();
parcours1 = WDParcoursSousChaine.pourTout(vWD_UnFichier, vWD_sListeFichier.getString(), new WDChaineA("\r\n").getString(), 0x2);
while(parcours1.testParcours())
{
// 	Si ExtraitChaîne(fExtraitChemin(UnFIchier,fFichier),rangPremier,"-",DepuisDébut) = gnID ALORS
if(WDAPIChaine.extraitChaine(WDAPIFichier.fExtraitChemin(parcours1.getVariableParcours().getString(),4),new WDEntier8(-2147483648l).getInt(),new WDChaineA("-"),0).opEgal(vWD_gnID))
{
// 		SI sImage = "" _OU_ UnFichier > sImage ALORS
if((vWD_sImage.opEgal("") || parcours1.getVariableParcours().opSup(vWD_sImage)))
{
// 			sImage = UnFichier
vWD_sImage.setValeur(parcours1.getVariableParcours());

}

}

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// RENVOYER sImage
return vWD_sImage;

}
finally
{
finExecProcLocale();
}

}


//  Résumé : Renvoie le chemin de la future Note
//  Syntaxe :
// DonneFuturChemin (<nIDEXPRESS> est entier)
// 
//  Paramètres :
// 	nIDEXPRESS (entier) :  L'ID de la note
//  Valeur de retour :
//  	Aucune
// 
public void fWD_donneFuturChemin( WDObjet vWD_nIDEXPRESS )
{
initExecProcLocale("DonneFuturChemin");


try
{
vWD_nIDEXPRESS = WDParametre.traiterParametre(vWD_nIDEXPRESS, 1, false, 8);


// RETOUR //gsRep + ["/"] + nID + "-" + DateSys() + HeureSys() + ".jpg"
return;

}
finally
{
finExecProcLocale();
}

}



class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_SansNom extends WDOptionMenu
{
public GWDMOPT_SansNom(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2834672140681717370l);

super.setNom("OPT_SansNom");

super.setType(40001);

super.setLibelle("Tout effacer");

super.setEtat(0);

super.setImage("C:\\WinDev Mobile 20 Express\\Exemples\\Android\\Android Notes\\effacer.png");

super.setVisible(true);

super.setCochee(false);

super.setNumero(3);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
//  On réinitialise le champ de dessin
{
super.selectionOptionMenu();
// dFinDessin(IMG_Note)
WDAPIDessin.dFinDessin(mWD_IMG_Note);

// dDébutDessin(IMG_Note)
WDAPIDessin.dDebutDessin(mWD_IMG_Note);

}



public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_SansNom mWD_OPT_SansNom = new GWDMOPT_SansNom(true);

public void initialiserSousObjets()
{
mWD_OPT_SansNom.initialiserObjet();
super.ajouterMenu(mWD_OPT_SansNom);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681651834l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



class GWDMMENU_SansNom1 extends WDMenuContextuel
{

class GWDMOPT_SansNom1 extends WDOptionMenu
{
public GWDMOPT_SansNom1(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_SansNom1.this);
super.setQuid(2834672140681848442l);

super.setNom("OPT_SansNom1");

super.setType(40001);

super.setLibelle("OPT_SansNom1");

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
public GWDMOPT_SansNom1 mWD_OPT_SansNom1 = new GWDMOPT_SansNom1(true);

public void initialiserSousObjets()
{
mWD_OPT_SansNom1.initialiserObjet();
super.ajouterMenu(mWD_OPT_SansNom1);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672140681782906l);

super.setNom("MENU_SansNom1");

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
public GWDMMENU_SansNom1 mWD_MENU_SansNom1;



/**
 * Traitement: Déclarations globales de EXPRESS_FEN_Edition
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gnID = WD_tabParam[0];
}
else { vWD_gnID = new WDEntier(0); }
super.ajouterVariableGlobale("gnID",vWD_gnID);

// Traitement du paramètre n°1
if(1<WD_ntabParamLen) 
{
vWD_gnBra = WD_tabParam[1];
}
else { vWD_gnBra = new WDChaineA(""); }
super.ajouterVariableGlobale("gnBra",vWD_gnBra);


// gsName est une chaine =gnBra+".png"
vWD_gsName= new WDChaineA();

vWD_gsName.setValeur(vWD_gnBra.opPlus(".png"));

super.ajouterVariableGlobale("gsName",vWD_gsName);



// gnCouleurEnCours est un entier = iNoir
vWD_gnCouleurEnCours= new WDEntier();

vWD_gnCouleurEnCours.setValeur(0);

super.ajouterVariableGlobale("gnCouleurEnCours",vWD_gnCouleurEnCours);



// gbCrayonEnfoncé  est un booléen
vWD_gbCrayonEnfonce= new WDBooleen();

super.ajouterVariableGlobale("gbCrayonEnfoncé",vWD_gbCrayonEnfonce);



// gnTailleCrayon	 est un entier = 2
vWD_gnTailleCrayon= new WDEntier();

vWD_gnTailleCrayon.setValeur(2);

super.ajouterVariableGlobale("gnTailleCrayon",vWD_gnTailleCrayon);



// gnX				 est un entier
vWD_gnX= new WDEntier();

super.ajouterVariableGlobale("gnX",vWD_gnX);



// gnY				 est un entier
vWD_gnY= new WDEntier();

super.ajouterVariableGlobale("gnY",vWD_gnY);



// gbEnregistré	 est un booléen = Vrai
vWD_gbEnregistre= new WDBooleen();

vWD_gbEnregistre.setValeur(true);

super.ajouterVariableGlobale("gbEnregistré",vWD_gbEnregistre);



// gbEnModeCrayon	 est un booleen = Vrai
vWD_gbEnModeCrayon= new WDBooleen();

vWD_gbEnModeCrayon.setValeur(true);

super.ajouterVariableGlobale("gbEnModeCrayon",vWD_gbEnModeCrayon);



}



/**
 * Traitement: Fin d'initialisation de EXPRESS_FEN_Edition
 */
public void init()
//  Récupération de la note
//  On initialise le dessin
{
super.init();

// dDébutDessin(IMG_Note)
WDAPIDessin.dDebutDessin(mWD_IMG_Note);

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gnID = WDVarNonAllouee.ref;
 public WDObjet vWD_gnBra = WDVarNonAllouee.ref;
 public WDObjet vWD_gsName = WDVarNonAllouee.ref;
 public WDObjet vWD_gnCouleurEnCours = WDVarNonAllouee.ref;
 public WDObjet vWD_gbCrayonEnfonce = WDVarNonAllouee.ref;
 public WDObjet vWD_gnTailleCrayon = WDVarNonAllouee.ref;
 public WDObjet vWD_gnX = WDVarNonAllouee.ref;
 public WDObjet vWD_gnY = WDVarNonAllouee.ref;
 public WDObjet vWD_gbEnregistre = WDVarNonAllouee.ref;
 public WDObjet vWD_gbEnModeCrayon = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_Edition
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_IMG_Note = new GWDIMG_Note();
mWD_IMG_Image1 = new GWDIMG_Image1();
mWD_IMG_Enregistrer = new GWDIMG_Enregistrer();
mWD_BTN_OUTILDESSIN = new GWDBTN_OUTILDESSIN();
mWD_IMG_Gomme = new GWDIMG_Gomme();
mWD_COMBO_Taille = new GWDCOMBO_Taille();
mWD_COULEUR_EN_COURS = new GWDCOULEUR_EN_COURS();
mWD_IMG_Crayon = new GWDIMG_Crayon();
mWD_BTN_SansNom1 = new GWDBTN_SansNom1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD__Menu = new GWDM_Menu();
mWD_MENU_SansNom1 = new GWDMMENU_SansNom1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Edition
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834672140680930938l);

super.setChecksum("931881942");

super.setNom("EXPRESS_FEN_Edition");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 533);

super.setTitre("Android Notes");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Edition
////////////////////////////////////////////////////////////////////////////
mWD_IMG_Note.initialiserObjet();
super.ajouter("IMG_Note", mWD_IMG_Note);
mWD_IMG_Image1.initialiserObjet();
super.ajouter("IMG_Image1", mWD_IMG_Image1);
mWD_IMG_Enregistrer.initialiserObjet();
super.ajouter("IMG_Enregistrer", mWD_IMG_Enregistrer);
mWD_BTN_OUTILDESSIN.initialiserObjet();
super.ajouter("BTN_OUTILDESSIN", mWD_BTN_OUTILDESSIN);
mWD_IMG_Gomme.initialiserObjet();
super.ajouter("IMG_Gomme", mWD_IMG_Gomme);
mWD_COMBO_Taille.initialiserObjet();
super.ajouter("COMBO_Taille", mWD_COMBO_Taille);
mWD_COULEUR_EN_COURS.initialiserObjet();
super.ajouter("COULEUR_EN_COURS", mWD_COULEUR_EN_COURS);
mWD_IMG_Crayon.initialiserObjet();
super.ajouter("IMG_Crayon", mWD_IMG_Crayon);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouter("BTN_SansNom1", mWD_BTN_SansNom1);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);
mWD_MENU_SansNom1.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_SansNom1);

super.terminerInitialisation();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
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
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
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
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_Edition;
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
