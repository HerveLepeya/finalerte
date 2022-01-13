/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_MENU
 * Date : 24/10/2021 18:20:33
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_MENU extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION1.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750614673108l);

super.setChecksum("581737187");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 8);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS01074@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION1
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
// OuvreFenêtreMobile(FEN_Nos_annonces)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Nos_annonces);

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
public GWDBTN_ACTION1 mWD_BTN_ACTION1 = new GWDBTN_ACTION1();

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MENU.ZM_ACTION1.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750614738644l);

super.setChecksum("581802267");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nos annonces");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

super.setTailleInitiale(135, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();

/**
 * LIB_SousTitreAction1
 */
class GWDLIB_SousTitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MENU.ZM_ACTION1.LIB_SousTitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750614804180l);

super.setChecksum("581867803");

super.setNom("LIB_SousTitreAction1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Découvrez nos annonces sur les tracasseries...");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

super.setTailleInitiale(135, 61);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x8E8E8F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_SousTitreAction1 mWD_LIB_SousTitreAction1 = new GWDLIB_SousTitreAction1();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION1.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION1);
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
mWD_LIB_SousTitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(164);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1_Ligne1 mWD_ZM_ACTION1_Ligne1 = new GWDZM_ACTION1_Ligne1();
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION1_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION1_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2376278750614542036l);

super.setChecksum("581648523");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 220);

super.setTailleInitiale(137, 164);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(1);

super.setAncrageInitial(9, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION1
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(BTN_ACTION1, trtclic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION1,18);

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
public GWDZM_ACTION1 mWD_ZM_ACTION1;

/**
 * ZM_ACTION3
 */
class GWDZM_ACTION3 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MENU.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION3_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION3
 */
class GWDBTN_ACTION3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION3.BTN_ACTION3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615328468l);

super.setChecksum("582392547");

super.setNom("BTN_ACTION3");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 8);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS10211@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION3
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
// HSupprimeTout(t_fileplainte)
WDAPIHF.hSupprimeTout(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"));

// OuvreFenêtreMobile(FEN_TypeDenonciation)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_TypeDenonciation);

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
public GWDBTN_ACTION3 mWD_BTN_ACTION3 = new GWDBTN_ACTION3();

/**
 * LIB_TitreAction3
 */
class GWDLIB_TitreAction3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MENU.ZM_ACTION3.LIB_TitreAction3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615394004l);

super.setChecksum("582457627");

super.setNom("LIB_TitreAction3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Je dénonce...");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

super.setTailleInitiale(134, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_TitreAction3 mWD_LIB_TitreAction3 = new GWDLIB_TitreAction3();

/**
 * LIB_SousTitreAction3
 */
class GWDLIB_SousTitreAction3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MENU.ZM_ACTION3.LIB_SousTitreAction3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615459540l);

super.setChecksum("582523163");

super.setNom("LIB_SousTitreAction3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Dénoncez tout type de tracasseries");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

super.setTailleInitiale(134, 45);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x8E8E8F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_SousTitreAction3 mWD_LIB_SousTitreAction3 = new GWDLIB_SousTitreAction3();
class GWDZM_ACTION3_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION3.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION3);
mWD_LIB_TitreAction3.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction3);
mWD_LIB_SousTitreAction3.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction3);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(164);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION3_Ligne1 mWD_ZM_ACTION3_Ligne1 = new GWDZM_ACTION3_Ligne1();
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION3_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION3_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2376278750615197396l);

super.setChecksum("582303883");

super.setNom("ZM_ACTION3");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(176, 220);

super.setTailleInitiale(136, 164);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(2);

super.setAncrageInitial(13, 330, 1000, 660, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION3
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// OuvreFenêtreMobile(FEN_TypeDenonciation)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_TypeDenonciation);

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
public GWDZM_ACTION3 mWD_ZM_ACTION3;

/**
 * ZM_ACTION6
 */
class GWDZM_ACTION6 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MENU.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION6_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION6
 */
class GWDBTN_ACTION6 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION6.BTN_ACTION6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615656148l);

super.setChecksum("582720227");

super.setNom("BTN_ACTION6");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 8);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\info_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION6
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
// OuvreFenêtreMobile(FEN_APropos)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_APropos);

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
public GWDBTN_ACTION6 mWD_BTN_ACTION6 = new GWDBTN_ACTION6();

/**
 * LIB_TitreAction6
 */
class GWDLIB_TitreAction6 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MENU.ZM_ACTION6.LIB_TitreAction6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615721684l);

super.setChecksum("582785307");

super.setNom("LIB_TitreAction6");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("A propos");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

super.setTailleInitiale(134, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_TitreAction6 mWD_LIB_TitreAction6 = new GWDLIB_TitreAction6();

/**
 * LIB_SousTitreAction6
 */
class GWDLIB_SousTitreAction6 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MENU.ZM_ACTION6.LIB_SousTitreAction6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750615787220l);

super.setChecksum("582850843");

super.setNom("LIB_SousTitreAction6");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version et contacts");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

super.setTailleInitiale(134, 45);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x8E8E8F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_SousTitreAction6 mWD_LIB_SousTitreAction6 = new GWDLIB_SousTitreAction6();
class GWDZM_ACTION6_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION6
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION6.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION6);
mWD_LIB_TitreAction6.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction6);
mWD_LIB_SousTitreAction6.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction6);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION6_Ligne1 mWD_ZM_ACTION6_Ligne1 = new GWDZM_ACTION6_Ligne1();
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION6
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION6_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION6_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2376278750615525076l);

super.setChecksum("582631563");

super.setNom("ZM_ACTION6");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(176, 398);

super.setTailleInitiale(136, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(4);

super.setAltitude(3);

super.setAncrageInitial(13, 330, 1000, 660, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION6
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(BTN_ACTION6, trtClic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION6,18);

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
public GWDZM_ACTION6 mWD_ZM_ACTION6;

/**
 * ZM_ACTION4
 */
class GWDZM_ACTION4 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_MENU.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION4_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION4
 */
class GWDBTN_ACTION4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MENU.ZM_ACTION4.BTN_ACTION4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750616311508l);

super.setChecksum("583375587");

super.setNom("BTN_ACTION4");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 8);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS01500@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION4
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
// OuvreFenêtreMobile(FEN_Suivi_Plainte)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Suivi_Plainte);

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
public GWDBTN_ACTION4 mWD_BTN_ACTION4 = new GWDBTN_ACTION4();

/**
 * LIB_TitreAction4
 */
class GWDLIB_TitreAction4 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MENU.ZM_ACTION4.LIB_TitreAction4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750616377044l);

super.setChecksum("583440667");

super.setNom("LIB_TitreAction4");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Suivi plainte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

super.setTailleInitiale(135, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_TitreAction4 mWD_LIB_TitreAction4 = new GWDLIB_TitreAction4();

/**
 * LIB_SousTitreAction4
 */
class GWDLIB_SousTitreAction4 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MENU.ZM_ACTION4.LIB_SousTitreAction4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750616442580l);

super.setChecksum("583506203");

super.setNom("LIB_SousTitreAction4");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Suivez le statut de votre plainte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

super.setTailleInitiale(135, 59);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x8E8E8F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

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
public GWDLIB_SousTitreAction4 mWD_LIB_SousTitreAction4 = new GWDLIB_SousTitreAction4();
class GWDZM_ACTION4_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION4.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION4);
mWD_LIB_TitreAction4.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction4);
mWD_LIB_SousTitreAction4.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction4);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(162);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION4_Ligne1 mWD_ZM_ACTION4_Ligne1 = new GWDZM_ACTION4_Ligne1();
/**
 * Initialise tous les champs de FEN_MENU.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION4_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION4_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2376278750616180436l);

super.setChecksum("583286923");

super.setNom("ZM_ACTION4");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 398);

super.setTailleInitiale(137, 162);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(3);

super.setAltitude(4);

super.setAncrageInitial(9, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION4
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(BTN_ACTION4, trtClic)
WDAPIVM.executeTraitement(mWD_BTN_ACTION4,18);

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
public GWDZM_ACTION4 mWD_ZM_ACTION4;

/**
 * IMG_Visuel
 */
class GWDIMG_Visuel extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_MENU.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376278750616508116l);

super.setChecksum("583574019");

super.setNom("IMG_Visuel");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 207);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\entete-bckgrd@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2359304, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(500, 500);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de IMG_Visuel
 */
public void init()
{
super.init();

// moimeme..Opacité=80
// moimeme..Opacité=80
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_OPACITE,80);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Visuel mWD_IMG_Visuel;

/**
 * IMG_Logo
 */
class GWDIMG_Logo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_MENU.IMG_Logo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376670572679617662l);

super.setChecksum("1370295305");

super.setNom("IMG_Logo");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(83, 25);

super.setTailleInitiale(154, 154);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\logo_black.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


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
public GWDIMG_Logo mWD_IMG_Logo;

/**
 * IMG_PDF
 */
class GWDIMG_PDF extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_MENU.IMG_PDF
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410776374678792952l);

super.setChecksum("655820175");

super.setNom("IMG_PDF");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(415, 38);

super.setTailleInitiale(24, 24);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\pdf@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xB8B2AC, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_PDF mWD_IMG_PDF;

/**
 * IMG_Document
 */
class GWDIMG_Document extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_MENU.IMG_Document
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410777143481788139l);

super.setChecksum("659669557");

super.setNom("IMG_Document");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(417, 78);

super.setTailleInitiale(24, 24);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\documents@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xB8B2AC, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF5A542, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_Document mWD_IMG_Document;

/**
 * IMG_Musique
 */
class GWDIMG_Musique extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_MENU.IMG_Musique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410777852152801726l);

super.setChecksum("661079469");

super.setNom("IMG_Musique");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(418, 119);

super.setTailleInitiale(24, 24);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\musics@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xB8B2AC, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0x80FF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_Musique mWD_IMG_Musique;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_MENU
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
// PROCEDURE ExecuteBouton(pChampZML)
initExecProcLocale("ExecuteBouton");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1

vWD_i.setValeur(1);


// BOUCLE
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
return;

}

}


}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_MENU
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// pos = GPSDernièrePosition()
GWDPTono_CF.getInstance().vWD_pos.setValeur(WDAPIGPS.gpsDernierePosition());

}




/**
 * Traitement: Fin d'initialisation de FEN_MENU
 */
public void init()
{
super.init();

// SI InternetConnecté() ALORS
// SI InternetConnecté() ALORS
if(WDAPINet.internetConnecte().getBoolean())
{
// 	gsRéponseVariantprovince est une chaîne ANSI
WDObjet vWD_gsReponseVariantprovince = new WDChaineA();



// 	SI HTTPRequête(gsUrlapi+"requestplaintes/GetProvinces", "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetProvinces").getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 		gsRéponseVariantprovince=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantprovince.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 		Désérialise(resultatprovince,gsRéponseVariantprovince,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_resultatprovince,vWD_gsReponseVariantprovince,1024);

// 		SI gsRéponseVariantprovince<>"[]" ALORS
if(vWD_gsReponseVariantprovince.opDiff("[]"))
{
// 			POUR TOUT resultsproved DE resultatprovince
IWDParcours parcours1 = null;
try
{
WDObjet vWD_resultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_resultatprovince);
parcours1 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_resultatprovince, vWD_resultsproved, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 				HLitRecherchePremier(t_province,ProvinceId,resultsproved.Id)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_province"),WDAPIHF.getRubriqueSansCasseNiAccent("provinceid"),parcours1.getVariableParcours().checkType(GWDCProvince.class).mWD_Id);

// 				SI HTrouve(t_province) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_province")).getBoolean())
{
// 					t_province.LibelleVille	= resultsproved.LibelleVille
WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("libelleville").setValeur(parcours1.getVariableParcours().checkType(GWDCProvince.class).mWD_LibelleVille);

// 					HModifie(t_province)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("t_province"));

}
else
{
// 					t_province.ProvinceId	= resultsproved.Id
WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("provinceid").setValeur(parcours1.getVariableParcours().checkType(GWDCProvince.class).mWD_Id);

// 					t_province.LibelleVille	= resultsproved.LibelleVille
WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("libelleville").setValeur(parcours1.getVariableParcours().checkType(GWDCProvince.class).mWD_LibelleVille);

// 					HAjoute(t_province)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_province"));

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


}

}
else
{
// 		Erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard"
);

}

// 	gsRéponseVariantterritoire est une chaîne ANSI
WDObjet vWD_gsReponseVariantterritoire = new WDChaineA();



// 	SI HTTPRequête(gsUrlapi+"requestplaintes/GetTerritoires", "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetTerritoires").getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 		gsRéponseVariantterritoire=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantterritoire.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 		Désérialise(resultatterritoire,gsRéponseVariantterritoire,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_resultatterritoire,vWD_gsReponseVariantterritoire,1024);

// 		SI gsRéponseVariantterritoire<>"[]" ALORS
if(vWD_gsReponseVariantterritoire.opDiff("[]"))
{
// 			POUR TOUT resultsproved DE resultatterritoire
IWDParcours parcours2 = null;
try
{
WDObjet vWD_resultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_resultatterritoire);
parcours2 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_resultatterritoire, vWD_resultsproved, null, null, null, 0x0, 0x2);
while(parcours2.testParcours())
{
// 				HLitRecherchePremier(t_territoire,TerritoireId,resultsproved.Id)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"),WDAPIHF.getRubriqueSansCasseNiAccent("territoireid"),parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_Id);

// 				SI HTrouve(t_territoire) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_territoire")).getBoolean())
{
// 					t_territoire.LibelleTerritoire	= resultsproved.LibelleTerritoire
WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("libelleterritoire").setValeur(parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_LibelleTerritoire);

// 					t_territoire.VilleId			= resultsproved.VilleId
WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("villeid").setValeur(parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_VilleId);

// 					HModifie(t_territoire)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"));

}
else
{
// 					t_territoire.TerritoireId		= resultsproved.Id
WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("territoireid").setValeur(parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_Id);

// 					t_territoire.LibelleTerritoire	= resultsproved.LibelleTerritoire
WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("libelleterritoire").setValeur(parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_LibelleTerritoire);

// 					t_territoire.VilleId			= resultsproved.VilleId
WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("villeid").setValeur(parcours2.getVariableParcours().checkType(GWDCCommune.class).mWD_VilleId);

// 					HAjoute(t_territoire)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"));

}

}

}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


}

}
else
{
// 		Erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard"
);

}

// 	gsRéponseVariantentite est une chaîne ANSI
WDObjet vWD_gsReponseVariantentite = new WDChaineA();



// 	SI HTTPRequête(gsUrlapi+"requestplaintes/GetEntites", "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetEntites").getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 		gsRéponseVariantentite=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantentite.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 		Désérialise(resultatEntiteAccuse,gsRéponseVariantentite,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_resultatEntiteAccuse,vWD_gsReponseVariantentite,1024);

// 		SI gsRéponseVariantentite<>"[]" ALORS
if(vWD_gsReponseVariantentite.opDiff("[]"))
{
// 			POUR TOUT resultsproved DE resultatEntiteAccuse
IWDParcours parcours3 = null;
try
{
WDObjet vWD_resultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_resultatEntiteAccuse);
parcours3 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_resultatEntiteAccuse, vWD_resultsproved, null, null, null, 0x0, 0x2);
while(parcours3.testParcours())
{
// 				HLitRecherchePremier(t_entite_accuse,EntiteId,resultsproved.Id)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"),WDAPIHF.getRubriqueSansCasseNiAccent("entiteid"),parcours3.getVariableParcours().checkType(GWDCEntiteAccuse.class).mWD_Id);

// 				SI HTrouve(t_entite_accuse) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse")).getBoolean())
{
// 					t_entite_accuse.NomEntite	= resultsproved.NomEntite
WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse").getRubriqueSansCasseNiAccent("nomentite").setValeur(parcours3.getVariableParcours().checkType(GWDCEntiteAccuse.class).mWD_NomEntite);

// 					HModifie(t_entite_accuse)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"));

}
else
{
// 					t_entite_accuse.EntiteId		= resultsproved.Id
WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse").getRubriqueSansCasseNiAccent("entiteid").setValeur(parcours3.getVariableParcours().checkType(GWDCEntiteAccuse.class).mWD_Id);

// 					t_entite_accuse.NomEntite		= resultsproved.NomEntite
WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse").getRubriqueSansCasseNiAccent("nomentite").setValeur(parcours3.getVariableParcours().checkType(GWDCEntiteAccuse.class).mWD_NomEntite);

// 					HAjoute(t_entite_accuse)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"));

}

}

}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


}

}
else
{
// 		Erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard"
);

}

// 	gsRéponseVariantdirection est une chaîne ANSI
WDObjet vWD_gsReponseVariantdirection = new WDChaineA();



// 	SI HTTPRequête(gsUrlapi+"requestplaintes/GetTypePlainte", "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetTypePlainte").getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 		gsRéponseVariantdirection=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantdirection.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 		Désérialise(resultatTypePlainte,gsRéponseVariantdirection,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_resultatTypePlainte,vWD_gsReponseVariantdirection,1024);

// 		SI gsRéponseVariantdirection<>"[]" ALORS
if(vWD_gsReponseVariantdirection.opDiff("[]"))
{
// 			HSupprimeTout(t_typeplainte)
WDAPIHF.hSupprimeTout(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"));

// 			POUR TOUT resultsproved DE resultatTypePlainte
IWDParcours parcours4 = null;
try
{
WDObjet vWD_resultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_resultatTypePlainte);
parcours4 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_resultatTypePlainte, vWD_resultsproved, null, null, null, 0x0, 0x2);
while(parcours4.testParcours())
{
// 				HLitRecherchePremier(t_typeplainte,TypePlainteId,resultsproved.Id)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("typeplainteid"),parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_Id);

// 				SI HTrouve(t_typeplainte) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte")).getBoolean())
{
// 					t_typeplainte.LibelleTypePlainte	= resultsproved.LibelleTypePlainte
WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("libelletypeplainte").setValeur(parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_LibelleTypePlainte);

// 					t_typeplainte.EntiteAccuseId	= resultsproved.EntiteAccuseId
WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("entiteaccuseid").setValeur(parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_EntiteAccuseId);

// 					HModifie(t_typeplainte)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"));

}
else
{
// 					t_typeplainte.TypePlainteId			= resultsproved.Id
WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("typeplainteid").setValeur(parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_Id);

// 					t_typeplainte.LibelleTypePlainte	= resultsproved.LibelleTypePlainte
WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("libelletypeplainte").setValeur(parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_LibelleTypePlainte);

// 					t_typeplainte.EntiteAccuseId		= resultsproved.EntiteAccuseId
WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("entiteaccuseid").setValeur(parcours4.getVariableParcours().checkType(GWDCTypePlainte.class).mWD_EntiteAccuseId);

// 					HAjoute(t_typeplainte)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"));

}

}

}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


}

}
else
{
// 		Erreur(ErreurInfo())
WDAPIDialogue.erreur(WDAPIVM.erreurInfo().getString());

}

// 	gsRéponseVariantannonce est une chaîne ANSI
WDObjet vWD_gsReponseVariantannonce = new WDChaineA();



// 	SI HTTPRequête(gsUrlapi+"requestplaintes/GetAnnonces", "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetAnnonces").getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 		gsRéponseVariantannonce=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantannonce.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 		Désérialise(tabAnnonces,gsRéponseVariantannonce,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_tabAnnonces,vWD_gsReponseVariantannonce,1024);

// 		SI gsRéponseVariantannonce<>"[]" ALORS
if(vWD_gsReponseVariantannonce.opDiff("[]"))
{
// 			HSupprimeTout(t_annonces)
WDAPIHF.hSupprimeTout(WDAPIHF.getFichierSansCasseNiAccent("t_annonces"));

// 			POUR TOUT resultsproved DE tabAnnonces
IWDParcours parcours5 = null;
try
{
WDObjet vWD_resultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_tabAnnonces);
parcours5 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_tabAnnonces, vWD_resultsproved, null, null, null, 0x0, 0x2);
while(parcours5.testParcours())
{
// 				t_annonces.AnnonceId		= resultsproved.Id	
WDAPIHF.getFichierSansCasseNiAccent("t_annonces").getRubriqueSansCasseNiAccent("annonceid").setValeur(parcours5.getVariableParcours().checkType(GWDCAnnonces.class).mWD_Id);

// 				t_annonces.ContenuAnnonce	= resultsproved.ContenuAnnonce
WDAPIHF.getFichierSansCasseNiAccent("t_annonces").getRubriqueSansCasseNiAccent("contenuannonce").setValeur(parcours5.getVariableParcours().checkType(GWDCAnnonces.class).mWD_ContenuAnnonce);

// 				t_annonces.DateAnnonce		= resultsproved.DateAnnonce
WDAPIHF.getFichierSansCasseNiAccent("t_annonces").getRubriqueSansCasseNiAccent("dateannonce").setValeur(parcours5.getVariableParcours().checkType(GWDCAnnonces.class).mWD_DateAnnonce);

// 				t_annonces.TitreAnnonce		= resultsproved.TitreAnnonce
WDAPIHF.getFichierSansCasseNiAccent("t_annonces").getRubriqueSansCasseNiAccent("titreannonce").setValeur(parcours5.getVariableParcours().checkType(GWDCAnnonces.class).mWD_TitreAnnonce);

// 				HAjoute(t_annonces)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_annonces"));

}

}
finally
{
if(parcours5 != null)
{
parcours5.finParcours();
}
}


}

}
else
{
// 		Erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Une erreur a été détectée pendant la récupération des données. Veuillez réessayer plus tard"
);

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
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_MENU
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION3 = new GWDZM_ACTION3();
mWD_ZM_ACTION6 = new GWDZM_ACTION6();
mWD_ZM_ACTION4 = new GWDZM_ACTION4();
mWD_IMG_Visuel = new GWDIMG_Visuel();
mWD_IMG_Logo = new GWDIMG_Logo();
mWD_IMG_PDF = new GWDIMG_PDF();
mWD_IMG_Document = new GWDIMG_Document();
mWD_IMG_Musique = new GWDIMG_Musique();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_MENU
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 568, 320, 568, 160, 0);
declarerAgencement(0, 568, 559, 320, 568, 160, 1);
declarerAgencement(0, 593, 892, 800, 1280, 216, 0);
declarerAgencement(0, 948, 537, 800, 1280, 216, 1);
super.setQuid(2376278750614476500l);

super.setChecksum("587538764");

super.setNom("FEN_MENU");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

setAgencementEnEdition(0);
appliquerAgencement(getIndexAgencement());

super.setTitre("MENU");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MENU
////////////////////////////////////////////////////////////////////////////
mWD_ZM_ACTION1.initialiserObjet();
super.ajouter("ZM_ACTION1", mWD_ZM_ACTION1);
mWD_ZM_ACTION3.initialiserObjet();
super.ajouter("ZM_ACTION3", mWD_ZM_ACTION3);
mWD_ZM_ACTION6.initialiserObjet();
super.ajouter("ZM_ACTION6", mWD_ZM_ACTION6);
mWD_ZM_ACTION4.initialiserObjet();
super.ajouter("ZM_ACTION4", mWD_ZM_ACTION4);
mWD_IMG_Visuel.initialiserObjet();
super.ajouter("IMG_Visuel", mWD_IMG_Visuel);
mWD_IMG_Logo.initialiserObjet();
super.ajouter("IMG_Logo", mWD_IMG_Logo);
mWD_IMG_PDF.initialiserObjet();
super.ajouter("IMG_PDF", mWD_IMG_PDF);
mWD_IMG_Document.initialiserObjet();
super.ajouter("IMG_Document", mWD_IMG_Document);
mWD_IMG_Musique.initialiserObjet();
super.ajouter("IMG_Musique", mWD_IMG_Musique);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_MENU
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 568);

break;
case 1 :
super.setTailleInitiale(568, 559);

break;
case 2 :
super.setTailleInitiale(593, 892);

break;
case 3 :
super.setTailleInitiale(948, 537);

break;
}
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}
public int getModeContexteHF()
{
return 1;
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
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPTono_CF.getInstance().mWD_FEN_MENU;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE#WM";
}
}
