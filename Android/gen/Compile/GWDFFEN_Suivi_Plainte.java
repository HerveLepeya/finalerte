/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Suivi_Plainte
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Suivi_Plainte extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Suivi_Plainte
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Statut_de_l_accusé3
 */
class GWDLIB_Statut_de_l_accuse3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Suivi_Plainte.LIB_Statut_de_l_accusé3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2385009027593960110l);

super.setChecksum("619692313");

super.setNom("LIB_Statut_de_l_accusé3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Veuillez saisir la référence de la plainte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(10, 8);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_Statut_de_l_accuse3 mWD_LIB_Statut_de_l_accuse3;

/**
 * SAI_Reference
 */
class GWDSAI_Reference extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Suivi_Plainte.SAI_Reference
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,39);
super.setQuid(2385009027594091182l);

super.setChecksum("619822929");

super.setNom("SAI_Reference");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 34);

super.setTailleInitiale(300, 43);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("2"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("<Saisissez la référence de la plainte>");

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

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

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
public GWDSAI_Reference mWD_SAI_Reference;

/**
 * BTN_Rechercher
 */
class GWDBTN_Rechercher extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Suivi_Plainte.BTN_Rechercher
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2385009414160570911l);

super.setChecksum("639247020");

super.setNom("BTN_Rechercher");

super.setType(4);

super.setBulle("");

super.setLibelle("Rechercher");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(29, 94);

super.setTailleInitiale(262, 40);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Pict_Save_16_5@dpi160.png", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Rechercher
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI InternetConnecté() ALORS
// SI InternetConnecté() ALORS
if(WDAPINet.internetConnecte().getBoolean())
{
// 		gsRéponseVariantprovince est une chaîne ANSI
WDObjet vWD_gsReponseVariantprovince = new WDChaineA();



// 		SI HTTPRequête(gsUrlapi+"requestplaintes/GetStatusPlainte?Id="+SAI_Reference, "", "", "") = Vrai ALORS
if(WDAPIHttp.HTTPRequete(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/GetStatusPlainte?Id=").opPlus(mWD_SAI_Reference).getString(),"",new WDChaineU(""),new WDChaineU("")).opEgal(true))
{
// 			gsRéponseVariantprovince=HTTPDonneRésultat(httpRésultat)
vWD_gsReponseVariantprovince.setValeur(WDAPIHttp.HTTPDonneResultat(2));

// 			Désérialise(tabSuiviPlainte,gsRéponseVariantprovince,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_tabSuiviPlainte,vWD_gsReponseVariantprovince,1024);

// 			SI gsRéponseVariantprovince<>"[]" ALORS
if(vWD_gsReponseVariantprovince.opDiff("[]"))
{
// 				POUR TOUT stResultsproved de tabSuiviPlainte
IWDParcours parcours1 = null;
try
{
WDObjet vWD_stResultsproved = WDParcoursFactory.creerVariableParcours(GWDPTono_CF.getInstance().vWD_tabSuiviPlainte);
parcours1 = WDParcoursFactory.pourTout(GWDPTono_CF.getInstance().vWD_tabSuiviPlainte, vWD_stResultsproved, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 					Info("Le statut de votre plainte est : <"+stResultsproved.StatutPlainte+">")
WDAPIDialogue.info(new WDChaineU("Le statut de votre plainte est : <").opPlus(parcours1.getVariableParcours().checkType(GWDCSuiviPlainte.class).mWD_StatutPlainte).opPlus(">").getString());

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
// 			Erreur(ErreurInfo())
WDAPIDialogue.erreur(WDAPIVM.erreurInfo().getString());

}

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
public GWDBTN_Rechercher mWD_BTN_Rechercher;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Suivi_Plainte.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_Suivi_Plainte
 */
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
// Création des champs de la fenêtre FEN_Suivi_Plainte
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Statut_de_l_accuse3 = new GWDLIB_Statut_de_l_accuse3();
mWD_SAI_Reference = new GWDSAI_Reference();
mWD_BTN_Rechercher = new GWDBTN_Rechercher();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Suivi_Plainte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 495, 320, 568, 160, 0);
declarerAgencement(0, 568, 247, 320, 568, 160, 1);
declarerAgencement(0, 593, 811, 800, 1280, 216, 0);
declarerAgencement(0, 948, 456, 800, 1280, 216, 1);
super.setQuid(2385008864373172055l);

super.setChecksum("612930109");

super.setNom("FEN_Suivi_Plainte");

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

super.setTitre("Suivi Plainte");

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
// Initialisation des champs de FEN_Suivi_Plainte
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Statut_de_l_accuse3.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé3", mWD_LIB_Statut_de_l_accuse3);
mWD_SAI_Reference.initialiserObjet();
super.ajouter("SAI_Reference", mWD_SAI_Reference);
mWD_BTN_Rechercher.initialiserObjet();
super.ajouter("BTN_Rechercher", mWD_BTN_Rechercher);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Suivi_Plainte
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 495);

break;
case 1 :
super.setTailleInitiale(568, 247);

break;
case 2 :
super.setTailleInitiale(593, 811);

break;
case 3 :
super.setTailleInitiale(948, 456);

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
return GWDPTono_CF.getInstance().mWD_FEN_Suivi_Plainte;
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
