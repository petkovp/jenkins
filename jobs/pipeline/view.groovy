listView('Payment Gateway') {
    description('The view of the Payment Gateway')
    jobs {
        names(
        'Payment-Gateway',
        'Payment-Gateway/MultiBranch',
        'First-Pipeline',
        'Docker'
      )
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}