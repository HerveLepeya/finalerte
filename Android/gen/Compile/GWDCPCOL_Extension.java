/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Collection
 * Classe Android : COL_Extension
 * Date : 24/10/2021 13:30:22
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.executor.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDCPCOL_Extension extends WDCollProcAndroid
{

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}

protected String getNomCollection()
{
return "COL_Extension";
}
private final static GWDCPCOL_Extension ms_instance = new GWDCPCOL_Extension();
public final static GWDCPCOL_Extension getInstance()
{
return ms_instance;
}

// Code de déclaration de COL_Extension
static public void init()
{
// 
ms_instance.initDeclarationCollection();

try
{
// EType est une Enumération

}
finally
{
finDeclarationCollection();
}

}




// Code de terminaison de COL_Extension
static public void term()
{
// 
ms_instance.initTerminaisonCollection();

try
{
}
finally
{
finTerminaisonCollection();
}

}



public static class GWDEEType extends WDEnumeration
{
public final static EnumValue Images = new EnumValue(GWDEEType.class, null, 1, "Images", "jpg,jpeg,png");
public final static EnumValue Documents = new EnumValue(GWDEEType.class, null, 2, "Documents", "pdf,doc,docx");
public final static EnumValue Musique = new EnumValue(GWDEEType.class, null, 3, "Musique", "mp3,wav");
public final static EnumValue Vide = new EnumValue(GWDEEType.class, null, 4, "Vide", "*");
public GWDEEType(EnumValue value)
{
super(value!=null ? value : Images);
}
public GWDEEType()
{
super(Images);
}
}
// Nombre de Procédures : 3
//  Résumé : Listes les fichiers d'une extension particulières
//  Paramètres :
// 	sExtension (chaîne UNICODE) : Extension à lister
// 	sRepDepart (chaîne UNICODE) : Répertoire de départ
//  Valeur de retour :
//  	chaîne UNICODE : Liste des fichiers de l'extension
// 
static public WDObjet fWD_listerExtension( WDObjet _vWD_sExtension , WDObjet _vWD_sRepDepart )
{
// PROCÉDURE PRIVÉE ListerExtension(LOCAL sExtension est une chaîne,sRepDepart est une chaîne) : chaîne
ms_instance.initExecProcGlobale("ListerExtension");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
final WDObjet vWD_sFichierLocalExtension = new WDChaineU();

WDObjet vWD_sRepNiveau1 = new WDChaineU();



final WDObjet vWD_sExtension = WDParametre.traiterParametre(_vWD_sExtension, 1, true, 16);

final WDObjet vWD_sRepDepart = WDParametre.traiterParametre(_vWD_sRepDepart, 2, false, 16);


final WDProcedureInterne []fWDI_listeRepLocal = new WDProcedureInterne[1];
fWDI_listeRepLocal[0] = new WDProcedureInterne()
{
@Override
public String getNom()
{
return "ListeRepLocal";
}
@Override
public WDObjet executer(WDObjet... parametres)
{
verifNbParametres(parametres.length, 4);
return fWD_listeRepLocal(parametres[0], parametres[1], parametres[2], parametres[3]);
}
public WDObjet fWD_listeRepLocal( WDObjet vWD_sChemin , WDObjet vWD_sNomrep , WDObjet vWD_Change , WDObjet vWD_Pointeur )
{
// 	PROCÉDURE INTERNE ListeRepLocal(sChemin est une chaîne,sNomrep est une chaîne,Change est un entier <utile>, Pointeur est un entier <utile>)
initExecProcInterne();

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sfic = new WDChaineU();



vWD_sChemin = WDParametre.traiterParametre(vWD_sChemin, 1, false, 16);

vWD_sNomrep = WDParametre.traiterParametre(vWD_sNomrep, 2, false, 16);

vWD_Change = WDParametre.traiterParametre(vWD_Change, 3, false, 8);

vWD_Pointeur = WDParametre.traiterParametre(vWD_Pointeur, 4, false, 8);


// 	SI Contient(sChemin+[fSep]+sNomrep,fSep+".") ALORS
if(WDAPIChaine.contient(vWD_sChemin.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(vWD_sNomrep),WDAPIFichier.fSep().opPlus(".")).getBoolean())
{
// 		RENVOYER Vrai
return new WDBooleen(true);

}

// 	sfic est une chaîne 


// 	sfic=  fListeFichier(sChemin+[fSep]+sNomrep+[fSep]+"*."+sExtension,frNonRécursif)
vWD_sfic.setValeur(WDAPIFichier.fListeFichier(vWD_sChemin.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(vWD_sNomrep).opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("*.").opPlus(vWD_sExtension).getString(),new WDEntier4(2)));

// 	SectionCritiqueDébut("ListeExtensions")
WDAPIThread.sectionCritiqueDebut("ListeExtensions");

// 	sFichierLocalExtension+=[RC]+sfic
vWD_sFichierLocalExtension.setValeur(vWD_sFichierLocalExtension.opPlus(new WDChaineOptionnelle("\r\n").opPlus(vWD_sfic)));
// 	SectionCritiqueFin("ListeExtensions")
WDAPIThread.sectionCritiqueFin("ListeExtensions");

// 	RENVOYER Vrai
return new WDBooleen(true);

}
finally
{
finExecProcInterne();
}

}


};
WDAppelContexte.getContexte().declarerProcedureInterne(fWDI_listeRepLocal[0]);
// sFichierLocalExtension est une chaîne 


// sRepNiveau1 est une chaîne = fListeRépertoire(sRepDepart+[fSep],frNonRécursif)

vWD_sRepNiveau1.setValeur(WDAPIFichier.fListeRepertoire(vWD_sRepDepart.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).getString(),new WDEntier4(2)));


// POUR TOUT CHAÎNE sRep DE sRepNiveau1 SÉPARÉE PAR RC
IWDParcours parcours2 = null;
try
{
WDObjet vWD_sRep = new WDChaineU();
parcours2 = WDParcoursSousChaine.pourTout(vWD_sRep, null, null, vWD_sRepNiveau1, "\r\n", 0x2);
while(parcours2.testParcours())
{
// 	SI ExtraitChaîne(sRep,1,fSep,DepuisFin)[="." OU ExtraitChaîne(sRep,1,fSep,DepuisFin)="Android" ALORS
if((WDAPIChaine.extraitChaine(parcours2.getVariableParcours(),1,WDAPIFichier.fSep(),1).opCommencePar(".") | WDAPIChaine.extraitChaine(parcours2.getVariableParcours(),1,WDAPIFichier.fSep(),1).opEgal("Android")))
{
// 		CONTINUE
continue;

}

// 	fListeRépertoire(sRep+[fSep],ListeRepLocal)	
WDAPIFichier.fListeRepertoire(parcours2.getVariableParcours().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).getString(),fWDI_listeRepLocal[0]);

// 	ListeRepLocal(sRep+[fSep],"",0,0)	
fWDI_listeRepLocal[0].executer(parcours2.getVariableParcours().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())),new WDChaineU(""),new WDEntier4(0),new WDEntier4(0));

}

}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


// ListeRepLocal(sRepDepart+[fSep],"",0,0)
fWDI_listeRepLocal[0].executer(vWD_sRepDepart.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())),new WDChaineU(""),new WDEntier4(0),new WDEntier4(0));

// RENVOYER sFichierLocalExtension
return vWD_sFichierLocalExtension;

// 	PROCÉDURE INTERNE ListeRepLocal(sChemin est une chaîne,sNomrep est une chaîne,Change est un entier <utile>, Pointeur est un entier <utile>)

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}
finally
{
finExecProcGlobale();
}

}


//  Résumé : Liste tous les fichiers d'un type particulier 
//  Paramètres :
// 	eListeType (COL_Extension.EType) : Liste des types à lister
// 	bRecursif (booléen - valeur par défaut=1) : Mode récursif
// 	sRep (chaîne UNICODE) : Répertoire à lister (si vide alors on liste la mémoire interne)
//  Valeur de retour :
//  	Aucune
//  Procédure automatique :
//  La procédure est exécutée manuellement, lors d'un appel dans le code
//  Elle s'exécutera dans un thread (sans avoir besoin d'appeler la fonction ThreadExecute), sans utilisation de HFSQL
//  
static public void fWD_listerType_autoWX( WDObjet vWD_eListeType , WDObjet vWD_bRecursif , WDObjet vWD_sRep )
{
// PROCÉDURE ListerType(LOCAL eListeType est un EType,bRecursif est un booléen = Vrai, sRep est une chaîne = "")
ms_instance.initExecProcGlobale("ListerType");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sListeFichiers = new WDChaineU();



vWD_eListeType = WDParametre.traiterParametreEnumeration(vWD_eListeType, 1, true, GWDCPCOL_Extension.GWDEEType.class);

vWD_bRecursif = WDParametre.traiterParametre(vWD_bRecursif, 2, false, 1);

vWD_sRep = WDParametre.traiterParametre(vWD_sRep, 3, false, 16);


// <COMPILE SI TypeConfiguration <> iOS>
{
// 	sRep=SysRepCarteStockage()
vWD_sRep.setValeur(WDAPISys.sysRepCarteStockage());

}

// sListeFichiers est une chaîne


// SI bRecursif ALORS
if(vWD_bRecursif.getBoolean())
{
// 	POUR TOUT CHAÎNE sType DE eListeType SÉPARÉE PAR ","
IWDParcours parcours3 = null;
try
{
WDObjet vWD_sType = new WDChaineU();
parcours3 = WDParcoursSousChaine.pourTout(vWD_sType, null, null, vWD_eListeType, ",", 0x2);
while(parcours3.testParcours())
{
// 		sListeFichiers+=[RC]+ListerExtension(sType,sRep)
vWD_sListeFichiers.setValeur(vWD_sListeFichiers.opPlus(new WDChaineOptionnelle("\r\n").opPlus(GWDCPCOL_Extension.fWD_listerExtension(parcours3.getVariableParcours(),vWD_sRep))));
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
else
{
// 	sListeFichiers+=[RC]+fListeRépertoire(sRep+[fSep],frNonRécursif)
vWD_sListeFichiers.setValeur(vWD_sListeFichiers.opPlus(new WDChaineOptionnelle("\r\n").opPlus(WDAPIFichier.fListeRepertoire(vWD_sRep.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).getString(),new WDEntier4(2)))));
// 	POUR TOUT CHAÎNE sType DE eListeType SÉPARÉE PAR ","
IWDParcours parcours4 = null;
try
{
WDObjet vWD_sType = new WDChaineU();
parcours4 = WDParcoursSousChaine.pourTout(vWD_sType, null, null, vWD_eListeType, ",", 0x2);
while(parcours4.testParcours())
{
// 		sListeFichiers+=[RC]+fListeFichier(sRep+[fSep]+"*."+stype,frNonRécursif)
vWD_sListeFichiers.setValeur(vWD_sListeFichiers.opPlus(new WDChaineOptionnelle("\r\n").opPlus(WDAPIFichier.fListeFichier(vWD_sRep.opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("*.").opPlus(parcours4.getVariableParcours()).getString(),new WDEntier4(2)))));
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

// SI sListeFichiers = "" ALORS
if(vWD_sListeFichiers.opEgal(""))
{
// 	sListeFichiers = "__-1__"
vWD_sListeFichiers.setValeur("__-1__");

}

// gsFichierListe = sListeFichiers
GWDPTono_CF.getInstance().vWD_gsFichierListe.setValeur(vWD_sListeFichiers);

}
finally
{
finExecProcGlobale();
}

}
static public void fWD_listerType(WDObjet vWD_eListeType)
{
fWD_listerType(vWD_eListeType, new WDBooleen(true), new WDChaineU(""));
}
static public void fWD_listerType(WDObjet vWD_eListeType, WDObjet vWD_bRecursif)
{
fWD_listerType(vWD_eListeType, vWD_bRecursif, new WDChaineU(""));
}

static public void fWD_listerType(WDObjet vWD_eListeType, WDObjet vWD_bRecursif, WDObjet vWD_sRep)
{
WDProcExecutorThread.getInstance().initExecAutoProcedure_GEN("ListerType", 1, 100l, 0, 0, vWD_eListeType, vWD_bRecursif, vWD_sRep);
}

//  Résumé : Renvoie l'image d'un type selon l'extension
//  Paramètres :
// 	sFichier (chaîne UNICODE) : Extension voulu
//  Valeur de retour :
//  	chaîne UNICODE : Image de l'extension
// 
static public WDObjet fWD_getImageSelonExtension( WDObjet vWD_sFichier )
{
// PROCÉDURE GetImageSelonExtension(sFichier est une chaîne) : chaîne
ms_instance.initExecProcGlobale("GetImageSelonExtension");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sExtension = new WDChaineU();



vWD_sFichier = WDParametre.traiterParametre(vWD_sFichier, 1, false, 16);


// sExtension est une chaîne = Remplace(fExtraitChemin(sFichier,fExtension),".","")

vWD_sExtension.setValeur(WDAPIChaine.remplace(WDAPIFichier.fExtraitChemin(vWD_sFichier.getString(),8),new WDChaineU("."),new WDChaineU("")));


// SI Contient(Documents,sExtension) ALORS
if(WDAPIChaine.contient(GWDCPCOL_Extension.GWDEEType.Documents,vWD_sExtension).getBoolean())
{
// 	SI sExtension = "pdf" ALORS
if(vWD_sExtension.opEgal("pdf"))
{
// 		RENVOYER FEN_MENU.IMG_PDF
return GWDPTono_CF.getInstance().getFEN_MENU().mWD_IMG_PDF;

}
else
{
// 		RENVOYER FEN_MENU.IMG_Document
return GWDPTono_CF.getInstance().getFEN_MENU().mWD_IMG_Document;

}

}

// SI Contient(Images,sExtension) ALORS
if(WDAPIChaine.contient(GWDCPCOL_Extension.GWDEEType.Images,vWD_sExtension).getBoolean())
{
// 	RENVOYER sFichier
return vWD_sFichier;

}

// SI Contient(Musique,sExtension) ALORS
if(WDAPIChaine.contient(GWDCPCOL_Extension.GWDEEType.Musique,vWD_sExtension).getBoolean())
{
// 	RENVOYER FEN_MENU.IMG_Musique
return GWDPTono_CF.getInstance().getFEN_MENU().mWD_IMG_Musique;

}

// RENVOYER ""
return new WDChaineU("");

}
finally
{
finExecProcGlobale();
}

}



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
