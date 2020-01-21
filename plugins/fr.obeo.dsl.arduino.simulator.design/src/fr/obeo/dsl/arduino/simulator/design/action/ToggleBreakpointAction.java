package fr.obeo.dsl.arduino.simulator.design.action;

import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.action.AbstractToggleBreakpointAction;

import fr.obeo.dsl.arduino.simulator.design.launcher.LauncherDelegate;

public class ToggleBreakpointAction extends AbstractToggleBreakpointAction {

	@Override
	protected String getModelIdentifier() {
		return LauncherDelegate.MODEL_IDENTIFIER;
	}

}
