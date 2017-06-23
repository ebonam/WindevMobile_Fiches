/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_SansNom1
 * Date : 07/06/2016 15:47:15
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.liste.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_SansNom1 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_SansNom1
////////////////////////////////////////////////////////////////////////////

/**
 * LISTE_SansNom1
 */
class GWDLISTE_SansNom1 extends WDListe
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_SansNom1.LISTE_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671672519228250l);

super.setChecksum("917884592");

super.setNom("LISTE_SansNom1");

super.setType(7);

super.setLibelle("&Liste");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(61, 2);

super.setTailleInitiale(254, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setModeSelection(3);

super.setModeAscenseur(1, 1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setScrollRapide(false, false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice("Verdana", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xD6D2D0, 0x565250, 4, 4);

super.setStyleElement(0x2D2D2D, 0xFFFFFF, creerPolice("Verdana", -11.000000, 0), 36);

super.setStyleSelection(0x0, 0xEEE1C3, creerPolice("Verdana", -11.000000, 0));

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
public GWDLISTE_SansNom1 mWD_LISTE_SansNom1;

/**
 * BTN_Ouvrir
 */
class GWDBTN_Ouvrir extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_SansNom1.BTN_Ouvrir
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671672519293786l);

super.setChecksum("917948760");

super.setNom("BTN_Ouvrir");

super.setType(4);

super.setLibelle("Ouvrir");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(381, 12);

super.setTailleInitiale(29, 306);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000);

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
 * Traitement: Clic sur BTN_Ouvrir
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// gsRetour=LISTE_SansNom1[ListeSelect(LISTE_SansNom1)]
vWD_gsRetour.setValeur(mWD_LISTE_SansNom1.get(WDAPIListe.listeSelect(mWD_LISTE_SansNom1)));

// Ferme(Express_FEN_SansNom1,LISTE_SansNom1[ListeSelect(LISTE_SansNom1)])
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom1,mWD_LISTE_SansNom1.get(WDAPIListe.listeSelect(mWD_LISTE_SansNom1)));

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
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_SansNom1.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2834671672519359322l);

super.setChecksum("918013840");

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

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_SansNom1.#EXPRESSVersion

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
// Déclaration des champs du fils n°1 de EXPRESS_FEN_SansNom1.ACTB_ActionBar
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
 * Traitement: Déclarations globales de EXPRESS_FEN_SansNom1
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// HTTPRequête("https://api.dropboxapi.com/2/files/list_folder","","Authorization: Bearer "+fChargeTexte(fRepExe+"/fichier"+".txt")+RC+"Content-type: application/json","{"+Caract(34)+"path"+Caract(34)+":" +Caract(34)+Caract(34)+"}","application/json","","")
WDAPIHttp.HTTPRequete(new WDChaineA("https://api.dropboxapi.com/2/files/list_folder").getString(),new WDChaineA("").getString(),new WDChaineA("Authorization: Bearer ").opPlus(WDAPIFichier.fChargeTexte(WDAPIFichier.fRepExe().opPlus("/fichier").opPlus(".txt").getString())).opPlus("\r\n").opPlus("Content-type: application/json"),new WDChaineA("{").opPlus(WDAPIChaine.caract(34)).opPlus("path").opPlus(WDAPIChaine.caract(34)).opPlus(":").opPlus(WDAPIChaine.caract(34)).opPlus(WDAPIChaine.caract(34)).opPlus("}"),new WDChaineA("application/json").getString(),new WDChaineA("").getString(),new WDChaineA("").getString());

// chEXPRESS est un Buffer=HTTPGetResult(httpRésultat)
vWD_chEXPRESS = new WDBuffer();

vWD_chEXPRESS.setValeur(WDAPIHttp.HTTPDonneResultat(2));

super.ajouterVariableGlobale("chEXPRESS",vWD_chEXPRESS);



// fSauveBuffer(fRepExe+"/test.json",chEXPRESS)
WDAPIFichier.fSauveBuffer(WDAPIFichier.fRepExe().opPlus("/test.json").getString(),vWD_chEXPRESS);

// ch est une chaîne =fChargeBuffer(fRepExe+"/test.json")
vWD_ch= new WDChaineA();

vWD_ch.setValeur(WDAPIFichier.fChargeBuffer(WDAPIFichier.fRepExe().opPlus("/test.json").getString()));

super.ajouterVariableGlobale("ch",vWD_ch);



// gsRetour est une chaîne=""
vWD_gsRetour= new WDChaineA();

vWD_gsRetour.setValeur("");

super.ajouterVariableGlobale("gsRetour",vWD_gsRetour);



// i est un entier =ChaîneOccurrence(ch,"{")
vWD_i= new WDEntier();

vWD_i.setValeur(WDAPIChaine.chaineOccurrence(vWD_ch,new WDChaineA("{")));

super.ajouterVariableGlobale("i",vWD_i);



// Info(ch)
WDAPIDialogue.info(vWD_ch.getString());

// POUR e=3 _A_ i+1
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier8(vWD_i.opPlus(1));
for(WDObjet vWD_e = new WDEntier8(3);vWD_e.opInfEgal(_WDExpBorneMax0);vWD_e.opInc())
{
// 	SI ChaîneOccurrence(ExtraitChaîne(ExtraitChaîne(ExtraitChaîne(ch,e,"{"),2,","),4,Caract(34)),".xml")=1
if(WDAPIChaine.chaineOccurrence(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch,vWD_e.getInt(),new WDChaineA("{")),2,new WDChaineA(",")),4,WDAPIChaine.caract(34)),new WDChaineA(".xml")).opEgal(1))
{
// 		ListeAjoute(LISTE_SansNom1,ExtraitChaîne(ExtraitChaîne(ExtraitChaîne(ch,e,"{"),2,","),4,Caract(34)))
WDAPIListe.listeAjoute(mWD_LISTE_SansNom1,WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(WDAPIChaine.extraitChaine(vWD_ch,vWD_e.getInt(),new WDChaineA("{")),2,new WDChaineA(",")),4,WDAPIChaine.caract(34)).getString());

}

}
}

// gsReturn est une chaîne
vWD_gsReturn= new WDChaineA();

super.ajouterVariableGlobale("gsReturn",vWD_gsReturn);



}



/**
 * Traitement: Fermeture de EXPRESS_FEN_SansNom1
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// Ferme(Express_FEN_SansNom1,gsRetour)
WDAPIFenetre.ferme(GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom1,vWD_gsRetour);

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_chEXPRESS = WDVarNonAllouee.ref;
 public WDObjet vWD_ch = WDVarNonAllouee.ref;
 public WDObjet vWD_gsRetour = WDVarNonAllouee.ref;
 public WDObjet vWD_i = WDVarNonAllouee.ref;
 public WDObjet vWD_gsReturn = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_SansNom1
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LISTE_SansNom1 = new GWDLISTE_SansNom1();
mWD_BTN_Ouvrir = new GWDBTN_Ouvrir();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2834671672519162714l);

super.setChecksum("922735873");

super.setNom("EXPRESS_FEN_SansNom1");

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
// Initialisation des champs de EXPRESS_FEN_SansNom1
////////////////////////////////////////////////////////////////////////////
mWD_LISTE_SansNom1.initialiserObjet();
super.ajouter("LISTE_SansNom1", mWD_LISTE_SansNom1);
mWD_BTN_Ouvrir.initialiserObjet();
super.ajouter("BTN_Ouvrir", mWD_BTN_Ouvrir);
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
return GWDPEXPRESS_FichesPFSI.ms_Project.mWD_EXPRESS_FEN_SansNom1;
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
