listView('Payment Gateway') {
    description('The view of the Payment Gateway')
    jobs {
        names(
        'MultiBranch',
        'First-Pipeline'
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