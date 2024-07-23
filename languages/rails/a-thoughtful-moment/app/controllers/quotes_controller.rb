class QuotesController < ApplicationController
  def index
    @quotes = Quote.all
  end

  def show
    @quote = Quote.find(params[:id])
  end

  def new
    @quote = Quote.new
  end


  def create
    @quote = Quote.new(content:params[:quote][:content],image:params[:quote][:image])
    @quote.save
    redirect_to @quote
  end

  def edit
    @quote = Quote.find(params[:id])
  end

  def update
    @quote = Quote.find(params[:id])
    @quote.content = params[:quote][:content]
    @quote.image = params[:quote][:image]
    @quote.save
    redirect_to @quote
  end

  def destroy
    @quote = Quote.find(params[:id])
    @quote.destroy
  end
end
