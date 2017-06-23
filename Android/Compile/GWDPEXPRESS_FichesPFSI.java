/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Projet
 * Classe Android : EXPRESS_FichesPFSI
 * Date : 07/06/2016 15:50:12
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_fichespfsi.wdgen;


import com.masociete.express_fichespfsi.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEXPRESS_FichesPFSI extends WDProjet
{
/**
 * Accès au projet: EXPRESS_FichesPFSI
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEXPRESS_FichesPFSI.ms_Project
 */
public static GWDPEXPRESS_FichesPFSI ms_Project;

 // EXPRESS_FEN_SelecteurCouleur
public GWDFEXPRESS_FEN_SelecteurCouleur mWD_EXPRESS_FEN_SelecteurCouleur = new GWDFEXPRESS_FEN_SelecteurCouleur();
 // accesseur de EXPRESS_FEN_SelecteurCouleur
public GWDFEXPRESS_FEN_SelecteurCouleur getEXPRESS_FEN_SelecteurCouleur()
{
mWD_EXPRESS_FEN_SelecteurCouleur.verifierOuverte();
return mWD_EXPRESS_FEN_SelecteurCouleur;
}

 // EXPRESS_FEN_SuppressionDp
public GWDFEXPRESS_FEN_SuppressionDp mWD_EXPRESS_FEN_SuppressionDp = new GWDFEXPRESS_FEN_SuppressionDp();
 // accesseur de EXPRESS_FEN_SuppressionDp
public GWDFEXPRESS_FEN_SuppressionDp getEXPRESS_FEN_SuppressionDp()
{
mWD_EXPRESS_FEN_SuppressionDp.verifierOuverte();
return mWD_EXPRESS_FEN_SuppressionDp;
}

 // EXPRESS_FEN_ModifKEY
public GWDFEXPRESS_FEN_ModifKEY mWD_EXPRESS_FEN_ModifKEY = new GWDFEXPRESS_FEN_ModifKEY();
 // accesseur de EXPRESS_FEN_ModifKEY
public GWDFEXPRESS_FEN_ModifKEY getEXPRESS_FEN_ModifKEY()
{
mWD_EXPRESS_FEN_ModifKEY.verifierOuverte();
return mWD_EXPRESS_FEN_ModifKEY;
}

 // EXPRESS_FEN_Notes
public GWDFEXPRESS_FEN_Notes mWD_EXPRESS_FEN_Notes = new GWDFEXPRESS_FEN_Notes();
 // accesseur de EXPRESS_FEN_Notes
public GWDFEXPRESS_FEN_Notes getEXPRESS_FEN_Notes()
{
mWD_EXPRESS_FEN_Notes.verifierOuverte();
return mWD_EXPRESS_FEN_Notes;
}

 // EXPRESS_FEN_Edition
public GWDFEXPRESS_FEN_Edition mWD_EXPRESS_FEN_Edition = new GWDFEXPRESS_FEN_Edition();
 // accesseur de EXPRESS_FEN_Edition
public GWDFEXPRESS_FEN_Edition getEXPRESS_FEN_Edition()
{
mWD_EXPRESS_FEN_Edition.verifierOuverte();
return mWD_EXPRESS_FEN_Edition;
}

 // EXPRESS_FEN_Edit_Piece
public GWDFEXPRESS_FEN_Edit_Piece mWD_EXPRESS_FEN_Edit_Piece = new GWDFEXPRESS_FEN_Edit_Piece();
 // accesseur de EXPRESS_FEN_Edit_Piece
public GWDFEXPRESS_FEN_Edit_Piece getEXPRESS_FEN_Edit_Piece()
{
mWD_EXPRESS_FEN_Edit_Piece.verifierOuverte();
return mWD_EXPRESS_FEN_Edit_Piece;
}

 // EXPRESS_FEN_SansNom2
public GWDFEXPRESS_FEN_SansNom2 mWD_EXPRESS_FEN_SansNom2 = new GWDFEXPRESS_FEN_SansNom2();
 // accesseur de EXPRESS_FEN_SansNom2
public GWDFEXPRESS_FEN_SansNom2 getEXPRESS_FEN_SansNom2()
{
mWD_EXPRESS_FEN_SansNom2.verifierOuverte();
return mWD_EXPRESS_FEN_SansNom2;
}

 // EXPRESS_FEN_SansNom1
public GWDFEXPRESS_FEN_SansNom1 mWD_EXPRESS_FEN_SansNom1 = new GWDFEXPRESS_FEN_SansNom1();
 // accesseur de EXPRESS_FEN_SansNom1
public GWDFEXPRESS_FEN_SansNom1 getEXPRESS_FEN_SansNom1()
{
mWD_EXPRESS_FEN_SansNom1.verifierOuverte();
return mWD_EXPRESS_FEN_SansNom1;
}

 // EXPRESS_FEN_Fiche_Pieces
public GWDFEXPRESS_FEN_Fiche_Pieces mWD_EXPRESS_FEN_Fiche_Pieces = new GWDFEXPRESS_FEN_Fiche_Pieces();
 // accesseur de EXPRESS_FEN_Fiche_Pieces
public GWDFEXPRESS_FEN_Fiche_Pieces getEXPRESS_FEN_Fiche_Pieces()
{
mWD_EXPRESS_FEN_Fiche_Pieces.verifierOuverte();
return mWD_EXPRESS_FEN_Fiche_Pieces;
}


 // Constructeur de la classe GWDPEXPRESS_FichesPFSI
public GWDPEXPRESS_FichesPFSI()
{
ajouterFenetre("EXPRESS_FEN_SelecteurCouleur", mWD_EXPRESS_FEN_SelecteurCouleur);
ajouterFenetre("EXPRESS_FEN_SuppressionDp", mWD_EXPRESS_FEN_SuppressionDp);
ajouterFenetre("EXPRESS_FEN_ModifKEY", mWD_EXPRESS_FEN_ModifKEY);
ajouterFenetre("EXPRESS_FEN_Notes", mWD_EXPRESS_FEN_Notes);
ajouterFenetre("EXPRESS_FEN_Edition", mWD_EXPRESS_FEN_Edition);
ajouterFenetre("EXPRESS_FEN_Edit_Piece", mWD_EXPRESS_FEN_Edit_Piece);
ajouterFenetre("EXPRESS_FEN_SansNom2", mWD_EXPRESS_FEN_SansNom2);
ajouterFenetre("EXPRESS_FEN_SansNom1", mWD_EXPRESS_FEN_SansNom1);
ajouterFenetre("EXPRESS_FEN_Fiche_Pieces", mWD_EXPRESS_FEN_Fiche_Pieces);

}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPEXPRESS_FichesPFSI.ms_Project = new GWDPEXPRESS_FichesPFSI();

// Définition des langues du projet
GWDPEXPRESS_FichesPFSI.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1);
GWDPEXPRESS_FichesPFSI.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "2.0.1.0";}
public String getNomAPK(){ return "EXPRESS_FichesPFSI";}
public int getIdNomApplication(){return com.masociete.express_fichespfsi.R.string.app_name;}
public boolean isModeAnsi(){ return true;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.express_fichespfsi";}
public int getIdIconeApplication(){ return com.masociete.express_fichespfsi.R.drawable.i_c_o_n_e________0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 240;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 533;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\BLANCK.PNG",com.masociete.express_fichespfsi.R.drawable.blanck_20+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_TABLE_COLTITLE.PNG?E5_3NP_4_4_4_4",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_table_coltitle_19_np3_4_4_4_4_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_TABLE_COLPICT.PNG",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_table_colpict_18+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_SELECT.PNG?E5_3NP_4_4_4_4",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_select_17_np3_4_4_4_4_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_ROLLOVER.PNG",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_rollover_16+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_RADIO.PNG?E12_A6_Radio",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_radio_15_selector_anim+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_CBOX.PNG?E12_A6_Radio",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_cbox_14_selector_anim+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BREAK_PICT.PNG",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_break_pict_13+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BREAK.PNG",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_break_12+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\GENSTEEL_EDT.PNG?E5_3NP_4_4_4_4",com.masociete.express_fichespfsi.R.drawable.gensteel_edt_11_np3_4_4_4_4_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\GENSTEEL_BTN_STD.PNG?E5_A6_2NP",com.masociete.express_fichespfsi.R.drawable.gensteel_btn_std_10_np2_selector_anim+23, "");
super.ajouterFichierAssocie("C:\\WINDEV MOBILE 20 EXPRESS\\EXEMPLES\\ANDROID\\ANDROID NOTES\\EFFACER.PNG",com.masociete.express_fichespfsi.R.drawable.effacer_9+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\SÉPARATEUR_NOIR.PNG",com.masociete.express_fichespfsi.R.drawable.separateur_noir_8+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\IC_MENU_SAVE.PNG",com.masociete.express_fichespfsi.R.drawable.ic_menu_save_7+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\GOMME.PNG",com.masociete.express_fichespfsi.R.drawable.gomme_6+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\EFFACER.PNG",com.masociete.express_fichespfsi.R.drawable.effacer_5+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\CRAYON.PNG",com.masociete.express_fichespfsi.R.drawable.crayon_4+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_COMBO.PNG?E5_3NP_36_1_46_8",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_combo_3_np3_36_1_46_8_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_edt_2_np3_8_8_8_8_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_FICHESPFSI\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_fichespfsi.R.drawable.activandroid_4_hololight_btn_std_1_np3_9_6_10_10_selector+23, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPEXPRESS_FichesPFSI_InitProjet( String [] args)
{
GWDPEXPRESS_FichesPFSI.ms_Project.initialiserProjet("EXPRESS_FichesPFSI", "EXPRESS_Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPEXPRESS_FichesPFSI_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPEXPRESS_FichesPFSI.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPEXPRESS_FichesPFSI_InitProjet(null);
}
public void run()
{

GWDPEXPRESS_FichesPFSI.ms_Project.lancerProjet("EXPRESS_FEN_Notes");
}
}
}
