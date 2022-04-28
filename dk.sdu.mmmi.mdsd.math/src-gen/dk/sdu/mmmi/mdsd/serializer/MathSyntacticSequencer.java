/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MathSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MathGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MathGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'let' name=ID
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) ref=[Binding|ID]
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
