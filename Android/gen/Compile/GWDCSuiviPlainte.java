/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Structure
 * Classe Android : SuiviPlainte
 * Date : 24/10/2021 18:20:32
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCSuiviPlainte extends WDStructure
{
public WDObjet mWD_ReferencePlainte = new WDChaineU();
public WDObjet mWD_StatutPlainte = new WDChaineU();



public GWDCSuiviPlainte()
{
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
protected WDObjet getMembreByName(String sNomMembre)
{
if(sNomMembre.equals("referenceplainte")) return mWD_ReferencePlainte;
if(sNomMembre.equals("statutplainte")) return mWD_StatutPlainte;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_ReferencePlainte; membre.m_strNomMembre = "mWD_ReferencePlainte"; membre.m_bStatique = false; membre.m_strNomMembreWL = "ReferencePlainte"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 1 : membre.m_refMembre = mWD_StatutPlainte; membre.m_strNomMembre = "mWD_StatutPlainte"; membre.m_bStatique = false; membre.m_strNomMembreWL = "StatutPlainte"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;

default: return super.getMembreByIndex(nIndice - 2, membre);
}
}
protected WDPropriete getProprieteByName(String sNomPropriete)
{
return super.getProprieteByName(sNomPropriete);
}
protected WDPropriete getProprieteByIndex(int nIndice)
{
switch(nIndice)
{
default: return super.getProprieteByIndex(nIndice - 0);
}
}
}
