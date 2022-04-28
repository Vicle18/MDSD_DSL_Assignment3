/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal.InternalMathParser;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getBindingAccess().getAlternatives(), "rule__Binding__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExternalMethodAccess().getGroup(), "rule__ExternalMethod__Group__0");
			builder.put(grammarAccess.getExternalMethodAccess().getGroup_4(), "rule__ExternalMethod__Group_4__0");
			builder.put(grammarAccess.getVarBindingAccess().getGroup(), "rule__VarBinding__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getExternalUseAccess().getGroup(), "rule__ExternalUse__Group__0");
			builder.put(grammarAccess.getExternalUseAccess().getGroup_3(), "rule__ExternalUse__Group_3__0");
			builder.put(grammarAccess.getLetBindingAccess().getGroup(), "rule__LetBinding__Group__0");
			builder.put(grammarAccess.getMathExpAccess().getNameAssignment_1(), "rule__MathExp__NameAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExternalsAssignment_2(), "rule__MathExp__ExternalsAssignment_2");
			builder.put(grammarAccess.getMathExpAccess().getVariablesAssignment_3(), "rule__MathExp__VariablesAssignment_3");
			builder.put(grammarAccess.getExternalMethodAccess().getNameAssignment_1(), "rule__ExternalMethod__NameAssignment_1");
			builder.put(grammarAccess.getExternalMethodAccess().getParametersAssignment_3(), "rule__ExternalMethod__ParametersAssignment_3");
			builder.put(grammarAccess.getExternalMethodAccess().getParametersAssignment_4_1(), "rule__ExternalMethod__ParametersAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment(), "rule__Parameter__NameAssignment");
			builder.put(grammarAccess.getVarBindingAccess().getNameAssignment_1(), "rule__VarBinding__NameAssignment_1");
			builder.put(grammarAccess.getVarBindingAccess().getExpressionAssignment_3(), "rule__VarBinding__ExpressionAssignment_3");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_0_1(), "rule__Primary__ValueAssignment_0_1");
			builder.put(grammarAccess.getExternalUseAccess().getNameAssignment_0(), "rule__ExternalUse__NameAssignment_0");
			builder.put(grammarAccess.getExternalUseAccess().getParametersAssignment_2(), "rule__ExternalUse__ParametersAssignment_2");
			builder.put(grammarAccess.getExternalUseAccess().getParametersAssignment_3_1(), "rule__ExternalUse__ParametersAssignment_3_1");
			builder.put(grammarAccess.getLetBindingAccess().getNameAssignment_1(), "rule__LetBinding__NameAssignment_1");
			builder.put(grammarAccess.getLetBindingAccess().getBindingAssignment_3(), "rule__LetBinding__BindingAssignment_3");
			builder.put(grammarAccess.getLetBindingAccess().getBodyAssignment_5(), "rule__LetBinding__BodyAssignment_5");
			builder.put(grammarAccess.getVariableUseAccess().getRefAssignment(), "rule__VariableUse__RefAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathGrammarAccess grammarAccess;

	@Override
	protected InternalMathParser createParser() {
		InternalMathParser result = new InternalMathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
