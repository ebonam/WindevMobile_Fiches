/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_SansNom2
 * Date : 07/06/2016 15:47:15
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.liste.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_SansNom2 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_SansNom2
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Ouvrir
 */
class GWDBTN_Ouvrir extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_SansNom2.BTN_Ouvrir
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840027841927l);

super.setChecksum("922772396");

super.setNom("BTN_Ouvrir");

super.setType(4);

super.setLibelle("Ouvrir");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(409, 85);

super.setTailleInitiale(31, 151);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleLibelleSurvol(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleLibelleEnfonce(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleCadreRepos(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setStyleCadreSurvol(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setStyleCadreEnfonce(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\Gensteel_Btn_Std.png?E5_A6_2NP", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Ouvrir
 */
public void clicSurBoutonGauche()
// info(ExtraitChaîne(SAI_Fichier1,1,".xml"))
{
super.clicSurBoutonGauche();

// Ferme(Express_FEN_SansNom2,ExtraitChaîne(LISTE_SansNom2[LISTE_SansNom2],1,".xml"))
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2,WDAPIChaine.extraitChaine(mWD_LISTE_SansNom2.get(mWD_LISTE_SansNom2),1,new WDChaineA(".xml")));

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
public GWDBTN_Ouvrir mWD_BTN_Ouvrir;

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_SansNom2.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840027907463l);

super.setChecksum("922837476");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ouvrir une fiche: ");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(169, 43);

super.setTailleInitiale(42, 241);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice("Verdana", -11.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xD6D2D0, 0x565250, 4, 4);

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
public GWDLIB_SansNom2 mWD_LIB_SansNom2;
// Type de champ non géré (Forme) : Champ <EXPRESS_FEN_SansNom2.FRM_SansNom1> ignoré ! Message d'erreur inséré dans le code d'init.

/**
 * BTN_Créer
 */
class GWDBTN_Creer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_SansNom2.BTN_Créer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840028038535l);

super.setChecksum("922969004");

super.setNom("BTN_Créer");

super.setType(4);

super.setLibelle("Créer");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(114, 96);

super.setTailleInitiale(30, 85);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleLibelleSurvol(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleLibelleEnfonce(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

super.setStyleCadreRepos(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setStyleCadreSurvol(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setStyleCadreEnfonce(2, 0xEAEAEA, 0xD6D2D0, 0x565250, 4, 4);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\Gensteel_Btn_Std.png?E5_A6_2NP", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Créer
 */
public void clicSurBoutonGauche()
// fOuvre(SAI_Fichier+"\"+SAI_SansNom1+"",foEcriture)
{
super.clicSurBoutonGauche();

// si SAI_SansNom1<>"" alors
if(mWD_SAI_SansNom1.opDiff(""))
{
// 	fCrée("/sdcard/pfsi-Fiches/"+SAI_SansNom1+".xml")
WDAPIFichier.fCree(new WDChaineA("/sdcard/pfsi-Fiches/").opPlus(mWD_SAI_SansNom1).opPlus(".xml").getString());

// 	ferme(Express_FEN_SansNom2,+SAI_SansNom1)
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2,mWD_SAI_SansNom1);

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
public GWDBTN_Creer mWD_BTN_Creer;

/**
 * SAI_SansNom1
 */
class GWDSAI_SansNom1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_SansNom2.SAI_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,113,40);
super.setRectCompPrincipal(113,2,203,40);
super.setQuid(2834671840028104071l);

super.setChecksum("923033628");

super.setNom("SAI_SansNom1");

super.setType(20001);

super.setLibelle("Nom:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(68, 2);

super.setTailleInitiale(44, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

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

super.setStyleLibelle(0x2D2D2D, creerPolice("Verdana", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xD6D2D0, 0x565250, 4, 4);

super.setCadreInterne9Images(0xFFFFFF, "C:\\Mes Projets Mobile\\EXPRESS_FichesPFSI\\Gensteel_Edt.png?E5_3NP_4_4_4_4", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 1, 5);

super.setStyleSaisie(0x2D2D2D, creerPolice("Verdana", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de SAI_SansNom1
 */
public void init()
{
super.init();

// sai_SansNom1="FichePfsi-"+Today()+"-"+HeureVersChaîne(Now())
this.setValeur(new WDChaineA("FichePfsi-").opPlus(WDAPIDate.dateDuJour()).opPlus("-").opPlus(WDAPIDate.heureVersChaine(WDAPIDate.maintenant())));

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_SansNom1 mWD_SAI_SansNom1;

/**
 * LIB_Creer_une_nouvelle_fiche
 */
class GWDLIB_Creer_une_nouvelle_fiche extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_SansNom2.LIB_Creer_une_nouvelle_fiche
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840028169607l);

super.setChecksum("923099620");

super.setNom("LIB_Creer_une_nouvelle_fiche");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Creer une nouvelle fiche");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(32, 2);

super.setTailleInitiale(34, 306);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice("Verdana", -11.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xD6D2D0, 0x565250, 4, 4);

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
public GWDLIB_Creer_une_nouvelle_fiche mWD_LIB_Creer_une_nouvelle_fiche;

/**
 * LISTE_SansNom2
 */
class GWDLISTE_SansNom2 extends WDListe
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_SansNom2.LISTE_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840028235143l);

super.setChecksum("923166980");

super.setNom("LISTE_SansNom2");

super.setType(7);

super.setLibelle("Liste");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(213, 2);

super.setTailleInitiale(194, 306);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setModeSelection(3);

super.setModeAscenseur(1, 1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setScrollRapide(false, false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleElement(0x0, 0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 40);

super.setStyleSelection(0x0, 0xEFD385, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de LISTE_SansNom2
 */
public void init()
{
super.init();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_ResListeFichier= new WDChaineA();



// ResListeFichier est une chaine= fListeFichier("/sdcard/pfsi-Fiches/*.xml",frNonRécursif)

vWD_ResListeFichier.setValeur(WDAPIFichier.fListeFichier(new WDChaineA("/sdcard/pfsi-Fiches/*.xml").getString(),new WDEntier(2)));


// POUR TOUTE CHAÎNE cEXPRESS de ResListeFichier SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
WDObjet vWD_cEXPRESS = new WDChaineA();
parcours1 = WDParcoursSousChaine.pourTout(vWD_cEXPRESS, vWD_ResListeFichier.getString(), new WDChaineA("\r\n").getString(), 0x2);
while(parcours1.testParcours())
{
// 	ListeAjoute(LISTE_SansNom2,Remplace(cEXPRESS,"/sdcard/pfsi-Fiches/",""))
WDAPIListe.listeAjoute(this,WDAPIChaine.remplace(parcours1.getVariableParcours(),new WDChaineA("/sdcard/pfsi-Fiches/"),new WDChaineA("")).getString());

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
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
}
public GWDLISTE_SansNom2 mWD_LISTE_SansNom2;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_FEN_SansNom2.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671840028300679l);

super.setChecksum("923230692");

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

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_SansNom2.#EXPRESSVersion

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
// Déclaration des champs du fils n°1 de EXPRESS_FEN_SansNom2.ACTB_ActionBar
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
 * Traitement: Déclarations globales de EXPRESS_FEN_SansNom2
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
// Création des champs de la fenêtre EXPRESS_FEN_SansNom2
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Ouvrir = new GWDBTN_Ouvrir();
mWD_LIB_SansNom2 = new GWDLIB_SansNom2();
mWD_BTN_Creer = new GWDBTN_Creer();
mWD_SAI_SansNom1 = new GWDSAI_SansNom1();
mWD_LIB_Creer_une_nouvelle_fiche = new GWDLIB_Creer_une_nouvelle_fiche();
mWD_LISTE_SansNom2 = new GWDLISTE_SansNom2();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834671840027776391l);

super.setChecksum("927625045");

super.setNom("EXPRESS_FEN_SansNom2");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(460, 320);

super.setTitre("");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_SansNom2
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Ouvrir.initialiserObjet();
super.ajouter("BTN_Ouvrir", mWD_BTN_Ouvrir);
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
// Erreur d'initialisation du champ
mWD_BTN_Creer.initialiserObjet();
super.ajouter("BTN_Créer", mWD_BTN_Creer);
mWD_SAI_SansNom1.initialiserObjet();
super.ajouter("SAI_SansNom1", mWD_SAI_SansNom1);
mWD_LIB_Creer_une_nouvelle_fiche.initialiserObjet();
super.ajouter("LIB_Creer_une_nouvelle_fiche", mWD_LIB_Creer_une_nouvelle_fiche);
mWD_LISTE_SansNom2.initialiserObjet();
super.ajouter("LISTE_SansNom2", mWD_LISTE_SansNom2);
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
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom2;
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
