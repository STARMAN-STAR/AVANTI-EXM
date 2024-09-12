package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateAdministrator;
import mx.desarrollo.delegate.DelegateLearningUnit;

public class FacadeAdministrator {
    private final DelegateAdministrator delegateAdministrator = new DelegateAdministrator();
}
