Rails.application.routes.draw do
  # get 'home/index'
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html
  
  # Defines the root path route ("/")
  root "home#index"
  
  get 'home/index'
  get 'home/projects'
  get 'home/about'
  get 'home/contact'
  get 'home/help'
end
