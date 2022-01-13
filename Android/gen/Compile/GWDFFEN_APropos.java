/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_APropos
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.email.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_APropos extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_APropos
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_MENU
 */
class GWDZM_MENU extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_MENU_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_PICTO_VERSION
 */
class GWDIMG_PICTO_VERSION extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU.IMG_PICTO_VERSION
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585514753l);

super.setChecksum("595458696");

super.setNom("IMG_PICTO_VERSION");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(16, 19);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\about_version@dpi160.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_PICTO_VERSION mWD_IMG_PICTO_VERSION = new GWDIMG_PICTO_VERSION();

/**
 * LIB_VERSION
 */
class GWDLIB_VERSION extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.ZM_MENU.LIB_VERSION
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585580289l);

super.setChecksum("595521952");

super.setNom("LIB_VERSION");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("1.0.0.0");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 39);

super.setTailleInitiale(480, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDLIB_VERSION mWD_LIB_VERSION = new GWDLIB_VERSION();

/**
 * LIB_LIB_VERSION
 */
class GWDLIB_LIB_VERSION extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.ZM_MENU.LIB_LIB_VERSION
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585645825l);

super.setChecksum("595587488");

super.setNom("LIB_LIB_VERSION");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version de l'application");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 17);

super.setTailleInitiale(480, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_LIB_VERSION mWD_LIB_LIB_VERSION = new GWDLIB_LIB_VERSION();
class GWDZM_MENU_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_APropos.ZM_MENU
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_IMG_PICTO_VERSION.initialiserObjet();
super.ajouterChamp(mWD_IMG_PICTO_VERSION);
mWD_LIB_VERSION.initialiserObjet();
super.ajouterChamp(mWD_LIB_VERSION);
mWD_LIB_LIB_VERSION.initialiserObjet();
super.ajouterChamp(mWD_LIB_LIB_VERSION);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(74);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_MENU_Ligne1 mWD_ZM_MENU_Ligne1 = new GWDZM_MENU_Ligne1();

/**
 * ZM_MENU_Ligne2
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_PICTO_NOTER
 */
class GWDIMG_PICTO_NOTER extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU.IMG_PICTO_NOTER
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585776897l);

super.setChecksum("595720840");

super.setNom("IMG_PICTO_NOTER");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(16, 25);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\about_noter@dpi160.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_PICTO_NOTER mWD_IMG_PICTO_NOTER = new GWDIMG_PICTO_NOTER();

/**
 * LIB_LIB_VOTER
 */
class GWDLIB_LIB_VOTER extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.ZM_MENU.LIB_LIB_VOTER
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585842433l);

super.setChecksum("595784096");

super.setNom("LIB_LIB_VOTER");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Noter l'application");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 19);

super.setTailleInitiale(480, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_LIB_VOTER mWD_LIB_LIB_VOTER = new GWDLIB_LIB_VOTER();

/**
 * LIB_VOTER
 */
class GWDLIB_VOTER extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.ZM_MENU.LIB_VOTER
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128585907969l);

super.setChecksum("595849632");

super.setNom("LIB_VOTER");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Dites aux autres utilisateurs ce que vous pensez de cette application");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 41);

super.setTailleInitiale(480, 40);

super.setPlan(0);

super.setCadrageHorizontal(0);

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
public GWDLIB_VOTER mWD_LIB_VOTER = new GWDLIB_VOTER();
class GWDZM_MENU_Ligne2 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_APropos.ZM_MENU
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_IMG_PICTO_NOTER.initialiserObjet();
super.ajouterChamp(mWD_IMG_PICTO_NOTER);
mWD_LIB_LIB_VOTER.initialiserObjet();
super.ajouterChamp(mWD_LIB_LIB_VOTER);
mWD_LIB_VOTER.initialiserObjet();
super.ajouterChamp(mWD_LIB_VOTER);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(86);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_MENU_Ligne2 mWD_ZM_MENU_Ligne2 = new GWDZM_MENU_Ligne2();

/**
 * ZM_MENU_Ligne3
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_PICTO_WM
 */
class GWDIMG_PICTO_WM extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU.IMG_PICTO_WM
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586039041l);

super.setChecksum("595982984");

super.setNom("IMG_PICTO_WM");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(16, 19);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\about@DPI160.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_PICTO_WM mWD_IMG_PICTO_WM = new GWDIMG_PICTO_WM();

/**
 * LIB_LIB_WM
 */
class GWDLIB_LIB_WM extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.ZM_MENU.LIB_LIB_WM
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586104577l);

super.setChecksum("596046240");

super.setNom("LIB_LIB_WM");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("FinAlerte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 19);

super.setTailleInitiale(480, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_LIB_WM mWD_LIB_LIB_WM = new GWDLIB_LIB_WM();

/**
 * LIB_WM
 */
class GWDLIB_WM extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.ZM_MENU.LIB_WM
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586170113l);

super.setChecksum("596111776");

super.setNom("LIB_WM");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("En savoir plus sur FinAlerte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 41);

super.setTailleInitiale(480, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

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
public GWDLIB_WM mWD_LIB_WM = new GWDLIB_WM();
class GWDZM_MENU_Ligne3 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_APropos.ZM_MENU
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_IMG_PICTO_WM.initialiserObjet();
super.ajouterChamp(mWD_IMG_PICTO_WM);
mWD_LIB_LIB_WM.initialiserObjet();
super.ajouterChamp(mWD_LIB_LIB_WM);
mWD_LIB_WM.initialiserObjet();
super.ajouterChamp(mWD_LIB_WM);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(74);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_MENU_Ligne3 mWD_ZM_MENU_Ligne3 = new GWDZM_MENU_Ligne3();

/**
 * ZM_MENU_Ligne4
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_PICTO_AUTRESAPPS
 */
class GWDIMG_PICTO_AUTRESAPPS extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ZM_MENU.IMG_PICTO_AUTRESAPPS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586301185l);

super.setChecksum("596245128");

super.setNom("IMG_PICTO_AUTRESAPPS");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(16, 25);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\about_app@dpi160.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097162, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_PICTO_AUTRESAPPS mWD_IMG_PICTO_AUTRESAPPS = new GWDIMG_PICTO_AUTRESAPPS();

/**
 * LIB_LIB_AUTRESAPPS
 */
class GWDLIB_LIB_AUTRESAPPS extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.ZM_MENU.LIB_LIB_AUTRESAPPS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586366721l);

super.setChecksum("596308384");

super.setNom("LIB_LIB_AUTRESAPPS");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Autres applications");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 19);

super.setTailleInitiale(480, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_LIB_AUTRESAPPS mWD_LIB_LIB_AUTRESAPPS = new GWDLIB_LIB_AUTRESAPPS();

/**
 * LIB_AUTRESAPPS
 */
class GWDLIB_AUTRESAPPS extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.ZM_MENU.LIB_AUTRESAPPS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586432257l);

super.setChecksum("596373920");

super.setNom("LIB_AUTRESAPPS");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("#");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(72, 41);

super.setTailleInitiale(480, 40);

super.setPlan(0);

super.setCadrageHorizontal(0);

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
public GWDLIB_AUTRESAPPS mWD_LIB_AUTRESAPPS = new GWDLIB_AUTRESAPPS();
class GWDZM_MENU_Ligne4 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_APropos.ZM_MENU
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_IMG_PICTO_AUTRESAPPS.initialiserObjet();
super.ajouterChamp(mWD_IMG_PICTO_AUTRESAPPS);
mWD_LIB_LIB_AUTRESAPPS.initialiserObjet();
super.ajouterChamp(mWD_LIB_LIB_AUTRESAPPS);
mWD_LIB_AUTRESAPPS.initialiserObjet();
super.ajouterChamp(mWD_LIB_AUTRESAPPS);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(86);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_MENU_Ligne4 mWD_ZM_MENU_Ligne4 = new GWDZM_MENU_Ligne4();
/**
 * Initialise tous les champs de FEN_APropos.ZM_MENU
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos.ZM_MENU
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_MENU_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_MENU_Ligne1);
mWD_ZM_MENU_Ligne2.initialiserObjet();
super.ajouterLigne(mWD_ZM_MENU_Ligne2);
mWD_ZM_MENU_Ligne3.initialiserObjet();
super.ajouterLigne(mWD_ZM_MENU_Ligne3);
mWD_ZM_MENU_Ligne4.initialiserObjet();
super.ajouterLigne(mWD_ZM_MENU_Ligne4);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2376279128585383681l);

super.setChecksum("595368208");

super.setNom("ZM_MENU");

super.setType(97);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 159);

super.setTailleInitiale(568, 320);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(500, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xD1D1D1);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de ZM_MENU
 */
public void init()
{
super.init();

// 
// LIB_VERSION = ExeInfo(exeVersion)
mWD_LIB_VERSION.setValeur(WDAPIExe.exeInfo("VERSION"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_MENU mWD_ZM_MENU;

/**
 * IMG_Visuel
 */
class GWDIMG_Visuel extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_APropos.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586497793l);

super.setChecksum("596441736");

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

super.setTailleInitiale(568, 157);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\entete-bckgrd@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 500, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(262152, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_Visuel mWD_IMG_Visuel;

/**
 * BTN_Action
 */
class GWDBTN_Action extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_APropos.BTN_Action
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376279128586563329l);

super.setChecksum("596505448");

super.setNom("BTN_Action");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(508, 128);

super.setTailleInitiale(46, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\pict-mail@dpi1x.png", 0, 1, 1, null, null, null);

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
 * Traitement: Clic sur BTN_Action
 */
public void clicSurBoutonGauche()
//  A Faire : A Propos : renseigner l'adresse e-mail de la société
{
super.clicSurBoutonGauche();

// // A Faire : A Propos : renseigner l'adresse e-mail de la société
// Email.Destinataire[1]="hervelepeya01@gmail.com"
WDVariableEmail.getDestinataire().get(1).setValeur("hervelepeya01@gmail.com");

// Email.NbDestinataire=1
WDVariableEmail.getNbDestinataire().setValeur(1);

// Email.Sujet=ExeInfo(exeNom)
WDVariableEmail.getSujet().setValeur(WDAPIExe.exeInfo("Nom"));

// EmailLanceAppli()
WDAPIEmail.emailLanceAppli();

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
public GWDBTN_Action mWD_BTN_Action;

/**
 * IMG_Logo
 */
class GWDIMG_Logo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_APropos.IMG_Logo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378594859149229662l);

super.setChecksum("757826570");

super.setNom("IMG_Logo");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(211, 46);

super.setTailleInitiale(147, 99);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\IconeTono Trans New2.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_APropos.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xF39621, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_APropos
 */
//  Cette fenêtre est un exemple d'interface personnalisable.
//  Vous pouvez la modifier selon vos besoins.
//  Les traitements à personnaliser sont identifiés par des "// A faire" que
//  vous pouvez retrouver en utilisant la recherche ou le volet "Liste des tâches"
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
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
// Création des champs de la fenêtre FEN_APropos
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_MENU = new GWDZM_MENU();
mWD_IMG_Visuel = new GWDIMG_Visuel();
mWD_BTN_Action = new GWDBTN_Action();
mWD_IMG_Logo = new GWDIMG_Logo();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_APropos
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 568, 320, 568, 160, 0);
declarerAgencement(0, 568, 499, 320, 568, 160, 1);
declarerAgencement(0, 593, 892, 800, 1280, 216, 0);
declarerAgencement(0, 948, 537, 800, 1280, 216, 1);
super.setQuid(2376279128585318145l);

super.setChecksum("600816449");

super.setNom("FEN_APropos");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

setAgencementEnEdition(1);
appliquerAgencement(getIndexAgencement());

super.setTitre("A Propos");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_APropos
////////////////////////////////////////////////////////////////////////////
mWD_ZM_MENU.initialiserObjet();
super.ajouter("ZM_MENU", mWD_ZM_MENU);
mWD_IMG_Visuel.initialiserObjet();
super.ajouter("IMG_Visuel", mWD_IMG_Visuel);
mWD_BTN_Action.initialiserObjet();
super.ajouter("BTN_Action", mWD_BTN_Action);
mWD_IMG_Logo.initialiserObjet();
super.ajouter("IMG_Logo", mWD_IMG_Logo);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_APropos
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 568);

break;
case 1 :
super.setTailleInitiale(568, 499);

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
return 2;
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
return 2;
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
return GWDPTono_CF.getInstance().mWD_FEN_APropos;
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
