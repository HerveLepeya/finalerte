/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_TypeDenonciation
 * Date : 19/10/2021 11:33:56
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_TypeDenonciation extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_TypeDenonciation
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_TypeDenonciation
 */
class GWDSEL_TypeDenonciation extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_TypeDenonciation.SEL_TypeDenonciation
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_TypeDenonciation_Option_0
 */
class GWDSEL_TypeDenonciation_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_TypeDenonciation.SEL_TypeDenonciation.SEL_TypeDenonciation_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Anonyme");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("0")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_TypeDenonciation_Option_0 mWD_SEL_TypeDenonciation_Option_0 = new GWDSEL_TypeDenonciation_Option_0();

/**
 * SEL_TypeDenonciation_Option_1
 */
class GWDSEL_TypeDenonciation_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_TypeDenonciation.SEL_TypeDenonciation.SEL_TypeDenonciation_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Identité Complète");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("1")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_TypeDenonciation_Option_1 mWD_SEL_TypeDenonciation_Option_1 = new GWDSEL_TypeDenonciation_Option_1();
/**
 * Initialise tous les champs de FEN_TypeDenonciation.SEL_TypeDenonciation
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_TypeDenonciation.SEL_TypeDenonciation
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_TypeDenonciation_Option_0);
super.ajouterOption(mWD_SEL_TypeDenonciation_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,270,79);
super.setQuid(2377183073185243301l);

super.setChecksum("608476862");

super.setNom("SEL_TypeDenonciation");

super.setType(6);

super.setBulle("");

super.setLibelle("&Sélecteur");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(23, 46);

super.setTailleInitiale(270, 79);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, false, true, false);

super.setValeurRenvoyeeParProgrammation(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x212121, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Radio@dpi160.png?E12_8O", 1);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SEL_TypeDenonciation
 */
public void modification()
{
super.modification();

// gnTypedenonciation=SEL_TypeDenonciation..Valeur
// gnTypedenonciation=SEL_TypeDenonciation..Valeur
GWDPTono_CF.getInstance().vWD_gnTypedenonciation.setValeur(this.getProp(EWDPropriete.PROP_VALEUR));

// OuvreFenêtreMobile(FEN_Plainte)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Plainte);

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
public GWDSEL_TypeDenonciation mWD_SEL_TypeDenonciation;

/**
 * LIB_Type_de_dénonciation
 */
class GWDLIB_Type_de_denonciation extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_TypeDenonciation.LIB_Type_de_dénonciation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377183541339868460l);

super.setChecksum("611665498");

super.setNom("LIB_Type_de_dénonciation");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Type de dénonciation :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(23, 10);

super.setTailleInitiale(270, 28);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_Type_de_denonciation mWD_LIB_Type_de_denonciation;

/**
 * Traitement: Déclarations globales de FEN_TypeDenonciation
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// SEL_TypeDenonciation=-1
mWD_SEL_TypeDenonciation.setValeur(-1);

}




/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_TypeDenonciation
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// ferme()
// ferme()
WDAPIFenetre.ferme();

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_TypeDenonciation
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SEL_TypeDenonciation = new GWDSEL_TypeDenonciation();
mWD_LIB_Type_de_denonciation = new GWDLIB_Type_de_denonciation();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_TypeDenonciation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2377182884196086918l);

super.setChecksum("599634732");

super.setNom("FEN_TypeDenonciation");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 148);

super.setTitre("TypeDenonciation");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(5);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_TypeDenonciation
////////////////////////////////////////////////////////////////////////////
mWD_SEL_TypeDenonciation.initialiserObjet();
super.ajouter("SEL_TypeDenonciation", mWD_SEL_TypeDenonciation);
mWD_LIB_Type_de_denonciation.initialiserObjet();
super.ajouter("LIB_Type_de_dénonciation", mWD_LIB_Type_de_denonciation);

super.terminerInitialisation();
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
return false;
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
return GWDPTono_CF.getInstance().mWD_FEN_TypeDenonciation;
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
