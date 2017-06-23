/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_ModifKEY
 * Date : 07/06/2016 15:47:14
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_ModifKEY extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_ModifKEY
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_ModifKEY.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672823596225817l);

super.setChecksum("943645275");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Entrez l'identificateur d’accès \r\nDropbox  (depuis l'app console)");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(65, 2);

super.setTailleInitiale(64, 318);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

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
public GWDLIB_SansNom1 mWD_LIB_SansNom1;

/**
 * SAI_SansNom1
 */
class GWDSAI_SansNom1 extends WDChampSaisieMultiLigne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_ModifKEY.SAI_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,80);
super.setRectCompPrincipal(2,2,283,80);
super.setQuid(2834672823596291353l);

super.setChecksum("943718213");

super.setNom("SAI_SansNom1");

super.setType(20001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(163, 21);

super.setTailleInitiale(84, 285);

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

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

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
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_ModifKEY.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672823596356889l);

super.setChecksum("943776803");

super.setNom("BTN_Valider");

super.setType(4);

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(305, 36);

super.setTailleInitiale(54, 128);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

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
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// fSauveTexte(fRepExe+"/fichier"+".txt", SAI_SansNom1)
WDAPIFichier.fSauveTexte(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString(),mWD_SAI_SansNom1);

// Ferme(Express_FEN_ModifKey) 
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_ModifKEY);

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
public GWDBTN_Valider mWD_BTN_Valider;

/**
 * BTN_Annuler
 */
class GWDBTN_Annuler extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_ModifKEY.BTN_Annuler
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672823596422425l);

super.setChecksum("943842339");

super.setNom("BTN_Annuler");

super.setType(4);

super.setLibelle("Annuler");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(305, 178);

super.setTailleInitiale(54, 128);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

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
 * Traitement: Clic sur BTN_Annuler
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Ferme(Express_FEN_ModifKey)
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_ModifKEY);

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
public GWDBTN_Annuler mWD_BTN_Annuler;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_ModifKEY.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834672823596487961l);

super.setChecksum("943907419");

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

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_ModifKEY.#EXPRESSVersion

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
// Déclaration des champs du fils n°1 de EXPRESS_FEN_ModifKEY.ACTB_ActionBar
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
 * Traitement: Déclarations globales de EXPRESS_FEN_ModifKEY
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



/**
 * Traitement: Fin d'initialisation de EXPRESS_FEN_ModifKEY
 */
public void init()
{
super.init();

// SAI_SansNom1=fChargeTexte(fRepExe+"/fichier"+".txt")
mWD_SAI_SansNom1.setValeur(WDAPIFichier.fChargeTexte(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString()));

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_ModifKEY
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_SAI_SansNom1 = new GWDSAI_SansNom1();
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_BTN_Annuler = new GWDBTN_Annuler();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_ModifKEY
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834672823596160281l);

super.setChecksum("948498380");

super.setNom("EXPRESS_FEN_ModifKEY");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(460, 320);

super.setTitre("ModifKEY");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_ModifKEY
////////////////////////////////////////////////////////////////////////////
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_SAI_SansNom1.initialiserObjet();
super.ajouter("SAI_SansNom1", mWD_SAI_SansNom1);
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_BTN_Annuler.initialiserObjet();
super.ajouter("BTN_Annuler", mWD_BTN_Annuler);
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
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_ModifKEY;
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
