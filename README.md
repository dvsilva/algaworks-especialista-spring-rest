# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 12-07-refatorando-servico-de-cadastro-de-restaurante-para-incluir-endereco
git add .
git commit -m "Refatorando serviço de cadastro de restaurante para incluir endereço"
git push origin 12-07-refatorando-servico-de-cadastro-de-restaurante-para-incluir-endereco

git checkout master
git merge --no-ff 12-07-refatorando-servico-de-cadastro-de-restaurante-para-incluir-endereco
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```